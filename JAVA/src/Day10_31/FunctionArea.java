package Day10_31;

import java.util.Scanner;

public class FunctionArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("넓이를 구할 원의 반지름을 입력하시오");
		int radius = sc.nextInt();
		areaOfCircle(radius);

		System.out.println("넓이를 구할 삼각형의 가로를 입력하시오");
		int width = sc.nextInt();
		System.out.println("넓이를 구할 삼각형의 세로를 입력하시오");
		int length = sc.nextInt();
		areaOfTriangle(width, length);

		System.out.println("1부터 100까지의 수의 홀수의 합은 아래와 같다");
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
