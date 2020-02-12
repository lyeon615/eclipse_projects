package PracticeExample_11_22;

import java.util.Scanner;

public class Problem implements IProblem {
	public static void main(String[] args) {

		IProblem p = new Problem();
		p.changeDallarToKorea();
		p.showMeTheMoney();
	}

	public void changeDallarToKorea() {
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원) >> ");
		int money = sc.nextInt();

		double change = (double) money / 1100;

		System.out.printf("%d원은 $%.1f입니다.", money, change);

		System.out.println();

	}

	public void showMeTheMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >> ");
		int money = sc.nextInt();

		int fiftyThousand = 0;
		int tenThousand = 0;
		int thousand = 0;
		int hundred = 0;
		int fifty = 0;
		int ten = 0;
		int one = 0;
		while (money >= 50000) {
			money -= 50000;
			fiftyThousand++;
		}
		while (money >= 10000) {
			money -= 10000;
			tenThousand++;
		}
		while (money >= 1000) {
			money -= 1000;
			thousand++;

		}
		while (money >= 100) {
			money -= 100;
			hundred++;

		}
		while (money >= 50) {
			money -= 50;
			fifty++;

		}
		while (money >= 10) {
			money -= 10;
			ten++;
		}
		while (money > 0) {
			money -= 1;
			one++;
		}
		System.out.printf("오만원권 %d매\n", fiftyThousand);
		System.out.printf("만원권 %d매\n", tenThousand);
		System.out.printf("천원권 %d매\n", thousand);
		System.out.printf("백원 %d매\n", hundred);
		System.out.printf("오십원 %d매\n", fifty);
		System.out.printf("십원 %d매\n", ten);
		System.out.printf("일원 %d매\n", one);

	}

//	Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 
//	오만 원권, 만 원권, 천 원권, 500짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력하라.
//	  
//	금액을 입력하시오>>65376
//	오만원권 1매
//	만원권 1매
//	천원권 5매
//	백원 3매
//	오십원 1매
//	십원 2매
//	일원 6매

}
