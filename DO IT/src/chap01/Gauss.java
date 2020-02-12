package chap01;

import java.util.Scanner;

public class Gauss {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구하자");
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
	
		int gauss = (1+n)*(n/2);
		System.out.print("1부터 "+ n + "까지 숫자의 합은" + gauss + "이다.");

		sc.close();
	}
	
	

}
