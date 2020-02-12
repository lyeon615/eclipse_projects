package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsTest {
	public static void main(String[] args) {

		Random rand = new Random();

		final String[] RPS = { "가위", "바위", "보" };
		int retry = 0;

		System.out.println("가위바위보를 시작합니다");
		try {
			do {
				System.out.println("1.가위\t2.바위\t3.보");
				System.out.println("선택하세요");
				int userChoice = 0;
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);

				userChoice = sc.nextInt();

				int comChoice = 1 + rand.nextInt(3);

				RockPaperScissors userRPS = new RockPaperScissors(userChoice);
				RockPaperScissors comPRS = new RockPaperScissors(comChoice);

				String user = RPS[userChoice - 1];
				String com = RPS[comChoice - 1];
				System.out.println("너는 " + user + "를 냈고 상대는 " + com + "를 냈다.");

				userRPS.result(comPRS);

				System.out.println("다시 하고 싶다면 1. 그만하고 싶다면 아무키나 입력하세요");
				retry = sc.nextInt();
			} while (retry == 1);
		} catch (Exception e) {
			System.out.println("다시 입력하세요");
		} finally {
			System.out.println("가위바위보를 종료합니다.");
		}
	}
}
