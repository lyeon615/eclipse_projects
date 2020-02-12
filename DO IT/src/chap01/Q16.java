package chap01;

import java.util.Scanner;

//n단의 * 피라미드 출력
//i행에 (i-1)*2+1개의 기호문자 *이 출력되게 하시오
//마지막 n행에는 (n-1)*2+1개의 기호문자 *을 출력하게 됩니다.
//숫자 피라미드 작성 
//  1
// 222
//33333
public class Q16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("별모양 피라미드 출력\n몇 단? ");
		int n = sc.nextInt();
		spira(n);
		
		npira(n);

		sc.close();
	}

	public static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (int j = 1; j <= (i * 2 - 1); j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void npira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1 ; j <= n-i ; j++)
				System.out.print(" ");
			for(int j = 1 ; j <= (i*2 - 1) ; j++)
				System.out.print(i%10);
			System.out.println();

		}
	}

}
