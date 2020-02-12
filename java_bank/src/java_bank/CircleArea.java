package java_bank;

public class CircleArea {

	double radius;
	
/*	CircleArea(double radius) {
		if (radius < 0) {
			System.out.println("음수는 안됩니다.");
		} else
			this.radius = radius;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

}
*/
	public void circleArea(int radius) {
		if (radius < 0) {
			System.out.println("음수는 안됩니다.");
		} else
			System.out.println(radius * radius * Math.PI);
	}
}
