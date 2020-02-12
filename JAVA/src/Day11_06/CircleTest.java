package Day11_06;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Circle[] circle = new Circle[3];

		double x = 0;
		double y = 0;
		int radius = 0;

		for (int i = 0; i < circle.length; i++) {
			System.out.print("x, y, radius >>");
			x = sc.nextDouble();
			y = sc.nextDouble();
			radius = sc.nextInt();
			
			circle[i] = new  Circle(x, y, radius);
		}

		for(Circle c : circle)
			c.show();
		
		sc.close();
	}

}
