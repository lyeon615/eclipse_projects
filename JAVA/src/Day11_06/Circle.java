package Day11_06;

//3개의 Circle 개체 배열을 만들고 x, y, radius 값을 읽어 
//3개의 Circle 객체를 만들고 
//show()를 이용해서 이들을 모두 출력
public class Circle {

	private double x, y;
	private int radius;

	Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}
}
