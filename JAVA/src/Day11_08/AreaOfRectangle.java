package Day11_08;

public class AreaOfRectangle implements IArea {
	private double length;
	private double height;

	AreaOfRectangle(double length, double height) {
		this.length = length;
		this.height = height;
	}
	@Override
	public double area() {
		return length * height;
	}
	@Override
	public void show() {
		System.out.print("가로가 " + length + " 세로가 " + height +"인 ");
		System.out.println("사각형의 넓이는 " + area());
	}
}

