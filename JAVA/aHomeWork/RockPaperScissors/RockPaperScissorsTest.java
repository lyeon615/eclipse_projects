package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsTest {
	public static void main(String[] args) {

		Random rand = new Random();

		final String[] RPS = { "����", "����", "��" };
		int retry = 0;

		System.out.println("������������ �����մϴ�");
		try {
			do {
				System.out.println("1.����\t2.����\t3.��");
				System.out.println("�����ϼ���");
				int userChoice = 0;
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);

				userChoice = sc.nextInt();

				int comChoice = 1 + rand.nextInt(3);

				RockPaperScissors userRPS = new RockPaperScissors(userChoice);
				RockPaperScissors comPRS = new RockPaperScissors(comChoice);

				String user = RPS[userChoice - 1];
				String com = RPS[comChoice - 1];
				System.out.println("�ʴ� " + user + "�� �°� ���� " + com + "�� �´�.");

				userRPS.result(comPRS);

				System.out.println("�ٽ� �ϰ� �ʹٸ� 1. �׸��ϰ� �ʹٸ� �ƹ�Ű�� �Է��ϼ���");
				retry = sc.nextInt();
			} while (retry == 1);
		} catch (Exception e) {
			System.out.println("�ٽ� �Է��ϼ���");
		} finally {
			System.out.println("������������ �����մϴ�.");
		}
	}
}
