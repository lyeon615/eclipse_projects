package Day10_31;

import java.util.Scanner;

public class Divide0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��Ͻÿ�");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		divide(num1, num2);
		
		sc.close();
	}
	public static void divide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
			return;
		}
		System.out.printf("������ ���: %.2f", ((double)num1/num2));
	}
}
