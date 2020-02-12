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
		System.out.print("���ΰ� " + length + " ���ΰ� " + height +"�� ");
		System.out.println("�簢���� ���̴� " + area());
	}
}

