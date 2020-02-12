package Day11_08;

public class AreaOfTriangle implements IArea {
	private double length;
	private double height;

	AreaOfTriangle(double length, double height) {
		this.length = length;
		this.height = height;
	}
	@Override
	public double area() {
		return length * height / 2;
	}
	@Override
	public void show() {
		System.out.print("가로가 " + length + " 세로가 " + height +"인 ");
		System.out.println("삼각형의 넓이는 " + area());
	}
}