package chap01;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구하자");
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i = 1 ; i <= n ; i++) {
			sum += i;
			System.out.print(i);
			if(i+1 <= n) {
				System.out.print("+");
			}
		}
		System.out.println("=" + sum);
		sc.close();
	}
}
