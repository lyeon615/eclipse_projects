package chap02;

import java.util.Scanner;

//y년 m월 d일의 그 해 남은 일수(12월 31일이면 0, 12월 30일 1)를 구하는 leftDayOfYear 메서드를 작성하세요
public class Q09 {
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, };

	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	static int dayOfYear(int y, int m, int d) {
		while (m - 1 > 0) {
			d += mdays[isLeap(y)][m - 1];
			m--;
		}
		return d;
	}

	static int leftDayOfYear(int y, int m, int d) {
		int resualt = 365;
		if (isLeap(y) == 1)
			resualt += 1;
		return resualt - dayOfYear(y, m, d);
		// return 365 + isLeap(y) - dayOfYear(y, m, d);
		// 답지에서는 이런식으로 이프문 없이 직진
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("그 해의 결과일수와 남은 일수를 구합니다.");
		System.out.print("년 : ");
		int year = sc.nextInt();
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("일 : ");
		int day = sc.nextInt();

		System.out.println(dayOfYear(year, month, day) + "일 째이고.");
		System.out.println("그 해는 " + leftDayOfYear(year, month, day) + "일 남았습니다.");
		sc.close();
	}
}
