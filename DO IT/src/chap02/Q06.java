package chap02;

import java.util.Scanner;

// 입력 받은 10진수를 2진수~36진수로 기수 변환하여 나타내시오
// 배열의 앞쪽에 아랫자리가 아니라 윗자리를 넣어두는 메서드를 작성하시오
public class Q06 {

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

		for (int i = 0; i < digits/2; i++)
			swap(d, i, digits - 1 - i);

		return digits;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		int r;
		int digit;
		char[] d = new char [32];
;

		System.out.println("10진수를 기수변환합니다.");
		do {
			System.out.print("기수변환할 양의 정수를 입력하시오 : ");
			x = sc.nextInt();
		} while (x < 0);

		do {
			System.out.print("몇진수로 변환하겠습니까? (2~36) : ");
			r = sc.nextInt();
		} while (r < 2 || r > 36);

		digit = cardConv(x, r, d);
		
		System.out.print(r + "진수로는 ");
		for (int i = 0; i < digit; i++)
			System.out.print(d[i]);
		System.out.println("입니다.");

		sc.close();
	}
}
