package sqlProject;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class WalkrRecordViewer {

	public static void main(String[] args) throws Exception {
		ConnectionMaker m = new MySqlConnectionMaker();
		MyRecordController c = new MyRecordController(m);
		Scanner sc = new Scanner(System.in);
		showMenu(c, sc);
		sc.close();
	}

	private static void showMenu(MyRecordController myRecordController, Scanner sc) {
		ConnectionMaker m = new MySqlConnectionMaker();
		PlanetController planetController = null;
		try {
			planetController = new PlanetController(m);
		} catch (Exception e) {
			e.printStackTrace();
		}
		while (true) {
			System.out.println("=======================================================");
			System.out.println("\t\t탐사일지\t\t");
			System.out.println("=======================================================");
			System.out.println("1.탐사기록 \t2.탐사록작성 \t3.행성검색 \t4.종료");
			System.out.print("> ");

			int choice = sc.nextInt();
			if (choice == 4) {
				System.out.println("또 우주를 탐험하러 가시나요?\n즐거운 여행 되세요!");
				break;
			} else if (choice == 3) {
				search(planetController, sc);
			} else if (choice == 2) {
				insert(myRecordController, planetController, sc);
			} else if (choice == 1) {
				showList(myRecordController, sc);
			}
		}
	}

	private static void search(PlanetController planetController, Scanner sc) {

		System.out.println("찾으신 행성의 정보를 찾아볼까요?");
		System.out.print("> ");
		sc.nextLine();
		String name = sc.nextLine();
		ArrayList<PlanetVO> list = planetController.search(name);
		System.out.println("=======================================================");
		System.out.println("1.행성번호  2.행성이름");
		System.out.println("=======================================================");

	
		if (list.size() == 0) {
			System.out.println("등록되어 있지 않은 행성입니다.");
		} else {
			for (PlanetVO p : list) {
				System.out.println(p.getId() + "\t" + p.getName());
			}
		}
	}

	private static void insert(MyRecordController myRecordController, PlanetController planetcontroller, Scanner sc) {
		sc.nextLine();
		MyRecordVO myRecordVO = new MyRecordVO();

		System.out.println("탐사행성의 이름을 찾으셨나요?\n행성번호를 적어주세요");
		myRecordVO.setPlanetId(sc.nextInt());
		sc.nextLine();
		PlanetVO p = planetcontroller.select(myRecordVO.getPlanetId());

		System.out.printf("행성의 이름이 %s가 정확합니까?\n맞다면 y를, 아니라면 n키를 입력해주세요. ", p.getName());
		String yesOrNo = sc.next();
		while (true) {
			if ("y".equalsIgnoreCase(yesOrNo)) {
				System.out.println("탐사행성의 이름을 성공적으로 등록하셨어요.");
				break;
			} else {
				System.out.println("잘못 입력하셨군요?\n행성정보를 재탐색해보세요! ");

				ConnectionMaker m = new MySqlConnectionMaker();
				PlanetController planetController = null;
				try {
					planetController = new PlanetController(m);
				} catch (Exception e) {
					e.printStackTrace();
				}
				search(planetController, sc);
			}
		}

		// 플라넷 타입이랑 비교해서 리스트에 없으면 그런 행성은 존재하지 않아요.. 출력하기
		// 1자바에서 어레이리스트 사용하기 2 에스큐엘 마이레코드 컨트롤러에서 조건문 명령어로 제어하기

		System.out.println("멋진 행성을 찾으셨군요! \n탐사날짜를 등록하겠습니다! ");

		while (true) {
			System.out.println("몇 년도에 발견한 행성인가요? 숫자 4개만 적어주세요! :");
			System.out.print("> ");
			int year = sc.nextInt();
			while (year < 0 || year > 2100) {
				System.out.println("네? 그 날짜는 아닐 것 같은데요.");
				System.out.println("몇 년도에 발견한 행성인가요? 숫자 4개만 적어주세요! :");
				System.out.print("> ");
				year = sc.nextInt();
			}
			System.out.println("몇 월에 발견한 행성인가요? 숫자 2개만 적어주세요! : ");
			System.out.print("> ");
			int month = sc.nextInt();
			while (month < 0 || month > 13) {
				System.out.println("네? 그 날짜는 아닐 것 같은데요.");
				System.out.println("몇 월에 발견한 행성인가요? 숫자 2개만 적어주세요! : ");
				System.out.print("> ");
				month = sc.nextInt();
			}
			System.out.println("몇 일에 발견한 행성인가요? 숫자 2개만 적어주세요! : ");
			System.out.print("> ");
			int day = sc.nextInt();
			while (day < 0 || day > 32) {
				System.out.println("네? 그 날짜는 아닐 것 같은데요.");
				System.out.println("몇 일에 발견한 행성인가요? 숫자 2개만 적어주세요! : ");
				System.out.print("> ");
				day = sc.nextInt();
			}
			System.out.printf("행성을 발견한 날짜가 %d년, %d월, %d일이 맞나요? \n" + " 맞다면 y를, 아니라면 n키를 입력해주세요. 싫으면 아무키나 입력하시던가요.\n",
					year, month, day);
			System.out.print("> ");

			String yesOrNo2 = sc.next();
			if ("y".equalsIgnoreCase(yesOrNo2)) {
				System.out.println("탐사날짜를 성공적으로 등록하셨어요.");
				Calendar cal = Calendar.getInstance();
				cal.set(Calendar.YEAR, year);
				cal.set(Calendar.MONTH, month);
				cal.set(Calendar.DAY_OF_MONTH, day);
				Date d = new Date(cal.getTimeInMillis());
				myRecordVO.setDiscoveryTime(d);
				break;

			} else {
				System.out.println("잘못 입력하셨군요?\n탐사날짜를 재등록하겠습니다! ");
			}
		}

		System.out.println("행성의 단계는 어떻게 되세요?");
		System.out.print("> ");
		myRecordVO.setLevel(sc.nextInt());

		System.out.println("행성의 위성은 확인해보셨나요?");
		System.out.print("> ");
		sc.nextLine();
		myRecordVO.setConnectingSatellite(sc.nextLine());

		myRecordController.insert(myRecordVO);

		showList(myRecordController, sc);
	}

	private static void showList(MyRecordController myRecordController, Scanner sc) {
		ArrayList<MyRecordVO> list = myRecordController.selectAll();
		ConnectionMaker m = new MySqlConnectionMaker();
		PlanetController planetController = null;
		try {
			planetController = new PlanetController(m);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("=======================================================");
		System.out.println("탐사번호\t행성번호 \t행성이름 \t생명체 \t 자원 \t 랜드마크");
		System.out.println("=======================================================");
		if (list.size() == 0) {
			System.out.println("작성된 글이 없습니다.");
		} else {
			for (MyRecordVO r : list) {
				System.out.println(r.getId() + "\t" + planetController.select(r.getPlanetId()));
			}

			System.out.println("몇 번째 글을 확인하실래요?(0은 메인메뉴로)");
			System.out.print("> ");

			int id = sc.nextInt();
			if (id != 0) {

				showOne(planetController, sc, id);
			}
		}
	}

	private static void showOne(PlanetController planetController, Scanner sc, int id) {

		ConnectionMaker m = new MySqlConnectionMaker();
		MyRecordController myRecordController;
		PlanetTypeController planetTypeController;

		try {
			myRecordController = new MyRecordController(m);
			planetTypeController = new PlanetTypeController(m);

			MyRecordVO myRecordVO = myRecordController.select(id);
			PlanetVO planetVO = planetController.select(myRecordVO.getPlanetId());
			PlanetTypeVO planetTypeVO = planetTypeController.select(planetVO.getType());

			if (myRecordVO.getId() == 0) {
				System.out.println("잘못 입력하셨습니다.");
				showList(myRecordController, sc);

			} else {
				System.out.println("=======================================================");
				System.out.println("행성번호: " + planetVO.getId());
				System.out.println("탐사행성: " + planetVO.getName());
				System.out.println("탐사날짜: " + myRecordVO.getDiscoveryTime());
				System.out.println("행성레벨: " + myRecordVO.getLevel());
				System.out.println("연결위성: " + myRecordVO.getConnectingSatellite());

				System.out.println("행성중력: " + planetVO.getGravity());
				System.out.println("행성타입: " + planetTypeVO.getType());
				System.out.println("생명체  : " + planetVO.getCreature());
				System.out.println("행성자원: " + planetVO.getResource());
				System.out.println("랜드마크: " + planetVO.getWonder());

				System.out.println("=======================================================");
				System.out.println("1.수정 \t 2.리스트로");
				System.out.print("> ");

				int choice = sc.nextInt();
				if (choice == 2) {
					showList(myRecordController, sc);

				} else if (choice == 1) {
					update(myRecordController, sc, id);
				}
			}

			//
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void update(MyRecordController myRecordController, Scanner sc, int id) {
		sc.nextLine();
		MyRecordVO myRecordVO = new MyRecordVO();

		System.out.print("행성레벨: ");
		myRecordVO.setLevel(sc.nextInt());
		System.out.print("연결위성: ");
		sc.nextLine();
		myRecordVO.setConnectingSatellite(sc.nextLine());
		myRecordVO.setId(id);
		myRecordController.update(myRecordVO);

		ConnectionMaker m = new MySqlConnectionMaker();
		PlanetController planetController;
		try {
			planetController = new PlanetController(m);
			showOne(planetController, sc, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
