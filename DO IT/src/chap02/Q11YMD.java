package chap02;

import java.util.Scanner;

//서기 년월일을 필드로 갖는 클래스를 만들고
//생성자(주어진 날짜) YMD(int y, int m, int d)
//메서드 YMD after(int n) n일 뒤의 날짜 반환 / YMD before(int n) n일 앞의 날짜 반환
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

		System.out.println("날짜를 입력하세요");
		System.out.print("년 : ");
		int y = sc.nextInt();
		System.out.print("월 : ");
		int m = sc.nextInt();
		System.out.print("일 : ");
		int d = sc.nextInt();
		System.out.println("오늘 날짜는 " + y + "년 " + m + "월 " + d + "일입니다.");
		
		System.out.print("n값을 입력하세요.");
		int n =sc.nextInt();
		Q11YMD ymd = new Q11YMD(y, m, d);	
		
		Q11YMD d1 = ymd.ymdAfter(n);
		System.out.printf("오늘을 기준으로 %d일 뒤의 날짜는 %d년 %d월 %d일 입니다.", n, d1.y, d1.m, d1.d);
		
		System.out.println();
		Q11YMD d2 = ymd.ymdbefore(n);
		System.out.printf("오늘을 기준으로 %d일 앞의 날짜는 %d년 %d월 %d일 입니다.", n, d2.y, d2.m, d2.d);
		sc.close();
	}

	
}
