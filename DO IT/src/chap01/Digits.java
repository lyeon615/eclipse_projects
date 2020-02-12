package chap01;

import java.util.Scanner;

//2자리의 양수(10~99)를 입력하자
public class Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		
		System.out.println("2자리의 양의 정수를 입력해보자");
		
		do {
			System.out.print("입력 : ");
			no = sc.nextInt();
		}while((no < 10 || no > 99));
				
		System.out.println("2자리의 양의 정수 " + no + "를 입력하셨습니다.");
		
		sc.close();
	}
}
