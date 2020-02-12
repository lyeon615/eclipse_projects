package chap02;
// 기수 변환 과정을 자세히 나타내는 프로그램을 작성하세요

import java.util.Scanner;

// 10진수를 기수변환합니다
// 변환하는 음이 아닌 정수 : 59
// 어떤 진수로 변환할까요? : 2
// 2|      59
//  +--------
// 2|      29 ... 1
//  +--------

// 2|       1 ... 1
//  +--------
//          0 ... 1
//2진수로 111011 입니다.
public class Q07 {
	static void swap(char[] a, int num1, int num2) {
		char t = a[num1];
		a[num1] = a[num2];
		a[num2] = t;
	}

	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);

		for (int i = 0; i < digits / 2; i++)
			swap(d, i, digits - 1 - i);

		return digits;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		int r;
		int digit;
		char[] d = new char[32];

		System.out.println("10진수를 기수변환합니다");
		do {
			System.out.print("변환하는 음이 아닌 정수 :");
			x = sc.nextInt();
		} while (x < 0);

		do {
			System.out.print("어떤 진수로 변환할까요? (2~36) :");
			r = sc.nextInt();
		} while (r < 2 || r > 36);

		System.out.printf("%2d|%10d\n", r, x);
		System.out.printf("%2s+%10s\n", " ", "----------");

		int x1 = x;
		int x2 = x;
		do {
			x1 /= r;
			System.out.printf("%2d|%10d ...%d\n", r, x1, x2 % r);
			x2 /= r;
			System.out.printf("%2s+%10s\n", " ", "----------");

		} while (x1 > x1 % r);
		
		System.out.printf("%2s %10d ...%d\n", "", 0, x1 % r);

		digit = cardConv(x, r, d);
		System.out.print(r + "진수로는 ");
		for (int i = 0; i < digit; i++)
			System.out.print(d[i]);
		System.out.println("입니다.");

		sc.close();
	}

}
