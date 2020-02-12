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
		System.out.println("그 해의 경과일수를 구합니다.");
		System.out.print("년 : "); int year = sc.nextInt();
		System.out.print("월 : "); int month = sc.nextInt();
		System.out.print("일 : "); int day = sc.nextInt();
		
		System.out.print(dayOfYear(year, month, day)+"일 째입니다.");
		
		sc.close();
	}	
}
