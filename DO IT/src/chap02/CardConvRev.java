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
		
		System.out.println("10������ �����ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
				x = sc.nextInt();
			}while(x<0);
			do {
				System.out.print("� ������ ��ȯ�Ͻðڽ��ϱ�? (2~36) : ");
				r = sc.nextInt();
			}while(r<2 || r>36);
			
			digits = cardConvR(x, r, d);
			
			System.out.print(r+"�����δ� ");
			for (int i = digits - 1 ; i >= 0; i--) 
				System.out.print(d[i]);
			System.out.println("�Դϴ�.");	
			
			System.out.print("�� �� �� �Ͻ÷��� 1���� �׸��Ͻ÷��� �ƹ�Ű�� �����ּ��� ");
			retry = sc.nextInt();
			
		}while(retry == 1);
		
		sc.close();
	}
}
