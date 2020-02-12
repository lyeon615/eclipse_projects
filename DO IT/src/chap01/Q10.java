package chap01;

import java.util.Scanner;

//두 변수 a, b에 정수를 입력하고 b-a를 출력하기 / 변수 b에 입력한 값이 a보다 작은 경우 다시 입력하게 하시오
public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("a의 값을 입력하시오");
		a = sc.nextInt();
		
		
		do {
			System.out.println("b의 값을 입력하시오");
			b = sc.nextInt();
		}while(a>=b);
		
		System.out.println("b-a = " + (b-a));

		
		sc.close();
	}
}
