package chap01;

import java.util.Scanner;

//1, 2 n�� ���� ���մϴ�(�����)
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
		
	
		System.out.println("1���� "+ n +"�� ���� ���� "+ sum +"�̴�.");
	
		sc.close();
	}
}
