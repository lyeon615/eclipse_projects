package Day10_31;

import java.util.Scanner;

public class Demo {

	public static void printStar(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void multiprication(int num1, int num2) {		
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		} 
		for (int i = 1; i <= 9; i++) {
			for (int j = num1; j <= num2; j++)
				System.out.printf("%d X %d = %-3d%2s", j, i, (i * j), "");
			System.out.println();
		}	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("삼각형의 변의 길이를 입력하시오");
		int num = sc.nextInt();
		printStar(num);

		System.out.println("구구단, 몇 단부터 몇 단까지 계산하시겠습니까?");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		multiprication(num1, num2);

		sc.close();
	}
}
