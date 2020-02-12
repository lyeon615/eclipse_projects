package board03;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.util.Scanner;

public class a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("몇 년도에 발견한 행성인가요? 숫자 4개만 적어주세요! :");
			System.out.print("> ");
			int year = sc.nextInt();
			while (year < 0 || year > 2100) {
				System.out.println("네? 그 날짜는 아닐 것 같은데요.");
				System.out.println("몇 년도에 발견한 행성인가요? 숫자 4개만 적어주세요!");
				System.out.print("> ");
				year = sc.nextInt();
			}
			System.out.println("몇 월에 발견한 행성인가요? 숫자 2개만 적어주세요!");
			System.out.print("> ");
			int month = sc.nextInt();
			while (month < 0 || month > 13) {
				System.out.println("네? 그 날짜는 아닐 것 같은데요.");
				System.out.println("몇 월에 발견한 행성인가요? 숫자 2개만 적어주세요!");
				System.out.print("> ");
				month = sc.nextInt();
			}
			System.out.println("몇 일에 발견한 행성인가요? 숫자 2개만 적어주세요!");
			System.out.print("> ");
			int day = sc.nextInt();
			while (day < 0 || day > 32) {
				System.out.println("네? 그 날짜는 아닐 것 같은데요.");
				System.out.println("몇 일에 발견한 행성인가요? 숫자 2개만 적어주세요!");
				System.out.print("> ");
				day = sc.nextInt();
			}
			System.out.printf("행성을 발견한 날짜가 %d년, %d월, %d일이 맞나요? \n" + " 맞다면 y를, 아니라면 n키를 입력해주세요. 싫으면 아무키나 입력하시던가요. ",
					year, month, day);
			System.out.print("> ");

			String yesOrNo = sc.next();

			if ("y".equalsIgnoreCase(yesOrNo)) {
				System.out.println("탐사날짜를 성공적으로 등록하셨어요.");
				break;
			} else {
				System.out.println("잘못 입력하셨군요?\n탐사날짜를 재등록하겠습니다! ");
			}

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

			System.out.println("yyyy-mm-dd형식으로 시간 입력해주세요");
			// 나는 질문을 세개로 쪼개서 답변이 세 개로 들어왔잖아? 그러면 이걸 어떻게 구성해야 되지?
			// 인트로 받았으니까 인트로 변경해줘야 될것 같은데..
			// 이런 식으로 int형식으로 만드는 게 가능한가?

			// SimpleDateFormat sdf = new SimpleDateFormat(year, month, day);

			String str = sc.nextLine();

			try {
				Date convertedDate = new Date(sdf.parse(str).getTime());
				sdf = new SimpleDateFormat("yyyy년 mm월 dd일");
				System.out.println(sdf.format(convertedDate));

			} catch (ParseException e) {
				e.printStackTrace();
			}
			// 그냥 저 인터페이스를 버리고 질문을 1개로 합쳐야 하나???

			/*
			 * Calendar cal = Calendar.getInstance(); cal.set(Calendar.YEAR, 2014);
			 * cal.set(Calendar.MONTH, 7); cal.set(Calendar.DAY_OF_MONTH, 15);
			 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일"); Date d = new
			 * Date(cal.getTimeInMillis()); System.out.println(sdf.format(d)); // sql에 넣을 수
			 * 있는 데이커 객체로 만들어주기
			 */
		}

		// 저 위에다 상수 대신 변수를 넣는데 scanner입력 받아서 넣기
		/*
		 * } private static void showOne(PlanetController planetController, Scanner sc,
		 * int id) { PlanetVO planetVO = myRecordController.select(id);
		 * 
		 * if (planetVO.getId() == 0) { System.out.println("잘못 입력하셨습니다.");
		 * showList(planetController, sc); } else {
		 * System.out.println("========================================");
		 * System.out.println("탐사행성: " + myRecordVO.getName());
		 * System.out.println("탐사날짜: " + myRecordVO.getDiscoveryTime());
		 * System.out.println("행성레벨: " + myRecordVO.getLevel());
		 * System.out.println("연결위성: " + myRecordVO.getConnectingSatellite());
		 * 
		 * System.out.println("========================================");
		 * System.out.println("1.수정 \t 2.리스트로"); System.out.print("> ");
		 * 
		 * int choice = sc.nextInt(); if (choice == 2) { showList(myRecordController,
		 * sc); } else if (choice == 1) { update(myRecordController, sc, id); } }
		 */
		sc.close();
	}
}