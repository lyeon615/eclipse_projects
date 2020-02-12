package chap02;

import java.util.Scanner;

//메서드 dayOfYear를 변수 i와 days없이 while문을 이용해서 구현하세요
public class Q08 {
	static int[][] mdays = { 
			{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, };

	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	static int dayOfYear(int y, int m, int d){
		while(m -1 > 0) {
			d += mdays[isLeap(y)][m-1];
			m--;
		}
	
		return d;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("그 해의 결과일수를 구합니다.");
		System.out.print("년 : "); int year = sc.nextInt();
		System.out.print("월 : "); int month = sc.nextInt();
		System.out.print("일 : "); int day = sc.nextInt();
		
		System.out.println(dayOfYear(year, month, day) + "일 째입니다.");
		sc.close();
	}
}
