package Day11_06;

//3���� Circle ��ü �迭�� ����� x, y, radius ���� �о� 
//3���� Circle ��ü�� ����� 
//show()�� �̿��ؼ� �̵��� ��� ���
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
