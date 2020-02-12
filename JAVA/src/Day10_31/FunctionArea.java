package Day10_31;

import java.util.Scanner;

public class FunctionArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("���̸� ���� ���� �������� �Է��Ͻÿ�");
		int radius = sc.nextInt();
		areaOfCircle(radius);

		System.out.println("���̸� ���� �ﰢ���� ���θ� �Է��Ͻÿ�");
		int width = sc.nextInt();
		System.out.println("���̸� ���� �ﰢ���� ���θ� �Է��Ͻÿ�");
		int length = sc.nextInt();
		areaOfTriangle(width, length);

		System.out.println("1���� 100������ ���� Ȧ���� ���� �Ʒ��� ����");
		oddTotal();

		sc.close();
	}

	public static void areaOfCircle(int radius) {
		final double PI = 3.14;
		System.out.println(radius * radius * PI);
	}

	public static void areaOfTriangle(int width, int length) {
		System.out.println((width * length) * ((double)1/2));
	}

	public static void oddTotal() {
		int total = 0;
		for (int i = 1; i <= 100; i++)
			if (i % 2 == 1)
				total += i;
		System.out.println(total);
	}

}
