package CorrectNumberGame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class CorrectNumber implements IRandomNum {
	@Override
	public void correctNum() {
		System.out.println("����� ���ڴ� �� ��? ���ڸ� ���纸����!");

		Random rand = new Random();
		int answer = 1 + rand.nextInt(100);
		int count = 0;
		int choice = 0;

		do {
			count++;
			System.out.print("1�� 100 ������ ���� �Է��ϼ��� :");
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			try {
				choice = sc.nextInt();
			} catch (InputMismatchException e) {
				// e.printStackTrace();
				System.out.println("��ȿ���� ���� ���Դϴ�. �ٽ� ���� �Է����ּ���.");
				continue;
			}

			if (answer == choice) {
				System.out.println("���߾����ϴ�.");
				break;
			} else if (answer > choice) {
				System.out.println("�� ū���� �Է��ϼ���");

			} else if (answer < choice) {
				System.out.println("�� �������� �Է��ϼ���");

			}

		} while (true);
		System.out.println("�õ�Ƚ���� " + count + "�� �Դϴ�.");

		
	}

}
