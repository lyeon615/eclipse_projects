package Day10_31;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("���̸� ���� �ﰢ���� ���θ� �Է��Ͻÿ�");
		int width = sc.nextInt();
		System.out.println("���̸� ���� �ﰢ���� ���θ� �Է��Ͻÿ�");
		int length = sc.nextInt();
		areaOfTriangle(width, length);

		sc.close();
	}

	public static void areaOfTriangle(int width, int length) {
		System.out.println((width * length) * (0.5));
	}
}
