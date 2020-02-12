package chap01;

import java.util.Scanner;

//1, 2 n의 합을 구합니다(양수만)
public class SymForPos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.print("n : ");
			n = sc.nextInt();
		}while(n <= 0);
		
		int sum = 0;
		
		for (int i = 1; i <= n ; i++) {
			sum += i;
		}
		
	
		System.out.println("1부터 "+ n +"의 값의 합은 "+ sum +"이다.");
	
		sc.close();
	}
}
