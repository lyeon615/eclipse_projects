package board02;
//게시판 예제 2

import java.sql.*;
import java.util.Scanner;
import java.util.ArrayList;
//CRUD 명령어를 최소한 메소드로 분리시키자
import java.util.Collections;

public class Board {
	int id;
	String title;
	String content;
	Date writtenDate;
	Date updatedDate;

	final static String URL = "jdbc:mysql://localhost:3306/example?serverTimezone=UTC";
	final static String USERNAME = "root";
	final static String PASSWORD = "1111";

	public static ArrayList<Board> selectAll() {
		ArrayList<Board> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String sql = "SELECT * FROM board";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Board b = new Board();
				b.id = rs.getInt("id");
				b.title = rs.getString("title");
				b.content = rs.getString("content");
				b.writtenDate = rs.getDate("writtenDate");
				b.updatedDate = rs.getDate("updatedDate");
				list.add(b);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public static Board select(int id) {
		Board b = new Board();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String sql = "SELECT * FROM board WHERE id = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				b.id = rs.getInt("id");
				b.title = rs.getString("title");
				b.content = rs.getString("content");
				b.writtenDate = rs.getDate("writtenDate");
				b.updatedDate = rs.getDate("updatedDate");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}

	public static void insert(Board b) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String sql = "INSERT INTO board (title, content, writtenDate, updatedDate) " + "VALUES(?, ?, NOW(), NOW())";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.title);
			pstmt.setString(2, b.content);
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void delete(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String sql = "DELETE FROM board WHERE id = ? ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void update(Board b) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String sql = "UPDATE board SET title = ?, content = ?, updatedDate = NOW() WHERE id = ? ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.title);
			pstmt.setString(2, b.content);
			pstmt.setInt(3, b.id);
			pstmt.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("======게시판======");
			System.out.println("1.목록 2.작성 3.종료");
			System.out.print("> ");

			int choice = sc.nextInt();
			if (choice == 3) {
				System.out.println("종료합니다.");
				break;
			} else if (choice == 2) {
				sc.nextLine();
				System.out.println("====================");
				System.out.print("제목: ");
				String title = sc.nextLine();
				System.out.println("====================");
				System.out.print("내용: ");
				String content = sc.nextLine();
				Board b = new Board();
				b.title = title;
				b.content = content;
				insert(b);
			} else if (choice == 1) {
				ArrayList<Board> list = selectAll();
				Collections.reverse(list);
				System.out.println("========목록========");
				if (list.size() == 0) {
					System.out.println("글이 없습니다.");
				} else {
					System.out.println("번호\t제목\t작성일\t");
					for (Board b : list) {
						System.out.println(b.id + "\t" + b.title + "\t" + b.writtenDate);
					}
					System.out.println("글 번호 선택(0은종료)");
					System.out.print("> ");
					int boardId = sc.nextInt();
					if (boardId != 0) {
						Board b = select(boardId);
						if (b.id == 0) {
							System.out.println("잘못 선택하였습니다.");
						} else {
							System.out.println("====================");
							System.out.println("제목: " + b.title);
							System.out.println("====================");
							System.out.println("작성일: " + b.writtenDate);
							System.out.println("수정일: " + b.updatedDate);
							System.out.println("====================");
							System.out.println("내용: " + b.content);
							System.out.println("====================");

							System.out.println("1.수정 2.삭제 3.메인으로");
							System.out.print("> ");

							choice = sc.nextInt();
							if (choice == 1) {
								sc.nextLine();
								Board update = new Board();
								update.id = boardId;
								System.out.print("제목 ");
								update.title = sc.nextLine();
								System.out.print("내용");
								update.content = sc.nextLine();
								update(update);
							} else if (choice == 2) {
								delete(boardId);
							}
						}
					}
				}
			}
		}
		sc.close();
	}
}
