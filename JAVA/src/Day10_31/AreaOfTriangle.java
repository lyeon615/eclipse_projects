package Day10_31;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("넓이를 구할 삼각형의 가로를 입력하시오");
		int width = sc.nextInt();
		System.out.println("넓이를 구할 삼각형의 세로를 입력하시오");
		int length = sc.nextInt();
		areaOfTriangle(width, length);

		sc.close();
	}

	public static void areaOfTriangle(int width, int length) {
		System.out.println((width * length) * (0.5));
	}
}
