package Day11_06;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		String source = "1 3 5";
		Scanner sc = new Scanner(source);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int sum = num1 + num2 + num3;

		System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, sum);

		sc.close();

		Scanner scan = new Scanner(System.in);
		

		System.out.print("문자열 입력 : ");
		String str1 = scan.nextLine();
		
		System.out.print("문자열 입력 : ");
		String str2 = scan.nextLine();

		System.out.printf("입력된 문자열 1 : %s \n", str1);
		System.out.printf("입력된 문자열 2 : %s \n", str2);
		
		scan.close();
	}
}
