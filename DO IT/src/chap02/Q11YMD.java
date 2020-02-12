package chap02;

import java.util.Scanner;

//���� ������� �ʵ�� ���� Ŭ������ �����
//������(�־��� ��¥) YMD(int y, int m, int d)
//�޼��� YMD after(int n) n�� ���� ��¥ ��ȯ / YMD before(int n) n�� ���� ��¥ ��ȯ
public class Q11YMD {
		int y;
		int m;
		int d;

		Q11YMD(int y, int m, int d) {
			this.y = y;
			this.m = m;
			this.d = d;
		}

		static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
				{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, };

		static int isLeap(int y) {
			return (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) ? 1 : 0;
		}

		Q11YMD ymdAfter(int n) {
			Q11YMD temp = new Q11YMD(this.y, this.m, this.d);
			if(n<0)
				return ymdbefore(-n);
			
			temp.d += n;
			
			while(temp.d > mdays[isLeap(temp.y)][temp.m-1]) {
				temp.d -= mdays[isLeap(temp.y)][temp.m-1];
				if(++temp.m > 12) {
					temp.y++;
					temp.m = 1;
				}
			}
			return temp;
		}

		Q11YMD ymdbefore(int n) {
			Q11YMD temp = new Q11YMD(this.y, this.m, this.d);
			if(n<0)
				return ymdAfter(-n);

			temp.d -= n;
			
			while(temp.d < 1) {
				if (--temp.m < 1) {
					temp.y--;
					temp.m = 12;
				}
				temp.d += mdays[isLeap(temp.y)][temp.m -1];
			}
			return temp;
		}
		
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("��¥�� �Է��ϼ���");
		System.out.print("�� : ");
		int y = sc.nextInt();
		System.out.print("�� : ");
		int m = sc.nextInt();
		System.out.print("�� : ");
		int d = sc.nextInt();
		System.out.println("���� ��¥�� " + y + "�� " + m + "�� " + d + "���Դϴ�.");
		
		System.out.print("n���� �Է��ϼ���.");
		int n =sc.nextInt();
		Q11YMD ymd = new Q11YMD(y, m, d);	
		
		Q11YMD d1 = ymd.ymdAfter(n);
		System.out.printf("������ �������� %d�� ���� ��¥�� %d�� %d�� %d�� �Դϴ�.", n, d1.y, d1.m, d1.d);
		
		System.out.println();
		Q11YMD d2 = ymd.ymdbefore(n);
		System.out.printf("������ �������� %d�� ���� ��¥�� %d�� %d�� %d�� �Դϴ�.", n, d2.y, d2.m, d2.d);
		sc.close();
	}

	
}
