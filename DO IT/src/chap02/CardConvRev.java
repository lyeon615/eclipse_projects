package chap02;

import java.util.Scanner;

public class CardConvRev {
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;

		} while (x != 0);
		return digits;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int r;
		int digits;
		int retry;
		char[] d = new char[32];
		
		System.out.println("10진수를 기수변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				x = sc.nextInt();
			}while(x<0);
			do {
				System.out.print("어떤 진수로 변환하시겠습니까? (2~36) : ");
				r = sc.nextInt();
			}while(r<2 || r>36);
			
			digits = cardConvR(x, r, d);
			
			System.out.print(r+"진수로는 ");
			for (int i = digits - 1 ; i >= 0; i--) 
				System.out.print(d[i]);
			System.out.println("입니다.");	
			
			System.out.print("한 번 더 하시려면 1번을 그만하시려면 아무키나 눌러주세요 ");
			retry = sc.nextInt();
			
		}while(retry == 1);
		
		sc.close();
	}
}
