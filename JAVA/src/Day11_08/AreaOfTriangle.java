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
		System.out.print("���ΰ� " + length + " ���ΰ� " + height +"�� ");
		System.out.println("�ﰢ���� ���̴� " + area());
	}
}