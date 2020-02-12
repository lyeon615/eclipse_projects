package CorrectNumberGame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class CorrectNumber implements IRandomNum {
	@Override
	public void correctNum() {
		System.out.println("행운의 숫자는 몇 번? 숫자를 맞춰보세요!");

		Random rand = new Random();
		int answer = 1 + rand.nextInt(100);
		int count = 0;
		int choice = 0;

		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요 :");
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			try {
				choice = sc.nextInt();
			} catch (InputMismatchException e) {
				// e.printStackTrace();
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
				continue;
			}

			if (answer == choice) {
				System.out.println("맞추었습니다.");
				break;
			} else if (answer > choice) {
				System.out.println("더 큰수를 입력하세요");

			} else if (answer < choice) {
				System.out.println("더 작은수를 입력하세요");

			}

		} while (true);
		System.out.println("시도횟수는 " + count + "번 입니다.");

		
	}

}
