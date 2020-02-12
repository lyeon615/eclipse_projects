package board03;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class BoardViewer {
	public static void main(String[] args) throws Exception {
		ConnectionMaker m = new MySqlConnectionMaker();
		BoardController c = new BoardController(m);
		Scanner sc = new Scanner(System.in);
		showMenu(c, sc);
		sc.close();
	}

	private static void showMenu(BoardController boardController, Scanner sc) {
		while (true) {
			System.out.println("========================================");
			System.out.println("\t\t게시판\t\t");
			System.out.println("========================================");
			System.out.println("1.목록보기 \t2.입력하기 \t3.종료하기");
			System.out.print("> ");

			int choice = sc.nextInt();
			if (choice == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (choice == 2) {
				insert(boardController, sc);
			} else if (choice == 1) {
				showList(boardController, sc);
			}
		}
	}
	private static void insert(BoardController boardController, Scanner sc) {
		sc.nextLine();
		System.out.print("제목: ");
		BoardVO boardVO = new BoardVO();
		
		boardVO.setTitle(sc.nextLine());
		System.out.print("내용: ");
		boardVO.setContent(sc.nextLine());
		boardController.insert(boardVO);
		showList(boardController, sc);
	}

	private static void showList(BoardController boardController, Scanner sc) {
		ArrayList<BoardVO> list = boardController.selectAll();
		Collections.reverse(list);
		System.out.println("========================================");
		System.out.println("글번호 \t 제목\t 입력날짜\t");
		System.out.println("========================================");
		if (list.size() == 0) {
			System.out.println("작성된 글이 없습니다.");

		} else {
			for (BoardVO b : list) {
				System.out.println(b);
			}
			System.out.println("글번호 선택(0은 메인메뉴로)");
			System.out.print("> ");
			int id = sc.nextInt();
			if (id != 0) {
				showOne(boardController, sc, id);
			}
		}
	}

	private static void showOne(BoardController boardController, Scanner sc, int id) {
		BoardVO boardVO = boardController.select(id);
		//boardVO.getId() 가 0이라면 값이 null이라는 건데 그러면 id가 존재하지 않는거여
		if (boardVO.getId() == 0) {
			System.out.println("잘못 입력하셨습니다.");
			showList(boardController, sc);
		} else {
			System.out.println("========================================");
			System.out.println("제목: " + boardVO.getTitle());
			System.out.println("========================================");
			System.out.println("작성일: " + boardVO.getWrittenDate());
			System.out.println("수정일: " + boardVO.getUpdatedDate());
			System.out.println("========================================");
			System.out.println(boardVO.getContent());
			System.out.println("========================================");
			System.out.println("1.수정 \t 2.삭제 \t 3.리스트로");
			System.out.print("> ");
			int choice = sc.nextInt();
			if (choice == 3) {
				showList(boardController, sc);
			} else if (choice == 2) {
				delete(boardController, id);
				showList(boardController, sc);
			} else if (choice == 1) {
				update(boardController, sc, id);
			}
		}
	}

	private static void delete(BoardController boardController, int id) {
		boardController.delete(id);
	}

	private static void update(BoardController boardController, Scanner sc, int id) {
		sc.nextLine();// 버퍼 메모리 비우기
		BoardVO boardVO = new BoardVO();
		System.out.print("제목: ");
		boardVO.setTitle(sc.nextLine());
		System.out.print("내용: ");
		boardVO.setContent(sc.nextLine());
		boardVO.setId(id);
		boardController.update(boardVO);
		showOne(boardController, sc, id);
	}

}
