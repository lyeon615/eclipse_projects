package chap01;

//���� a, b �� �����Ͽ� �� ������ ��� ������ ���� ���Ͻÿ�.
import java.util.Scanner;

public class Q9 {

	public static int sumOf(int a, int b) {

		int sumOf = 0;

		if (a >= b) {
			sumOf = a;
			for (int i = b; a > i; i++) {
				sumOf += i;
			}
			
			return sumOf;

		} else {
			sumOf = b;
			for (int i = a; b > i; i++) {
				sumOf += i;
			}

			return sumOf;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a���� �����ÿ�");
		int a = sc.nextInt();
		System.out.print("b���� �����ÿ�");
		int b = sc.nextInt();
		System.out.print(sumOf(a, b));

		sc.close();
	}
}
