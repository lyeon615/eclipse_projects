package chap02;

import java.util.Scanner;

public class DayOfYear {
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
	};
	static int isLeap(int year) {
		return (year %4 == 0 && year % 100 != 0 || year %400 ==0) ?1:0;
	}
	static int dayOfYear(int y, int m, int d) {
		int days = d;
		
		for(int i = 1 ; i < m ; i++)
			days += mdays[isLeap(y)][i-1];
		return days;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ����ϼ��� ���մϴ�.");
		System.out.print("�� : "); int year = sc.nextInt();
		System.out.print("�� : "); int month = sc.nextInt();
		System.out.print("�� : "); int day = sc.nextInt();
		
		System.out.print(dayOfYear(year, month, day)+"�� °�Դϴ�.");
		
		sc.close();
	}	
}
