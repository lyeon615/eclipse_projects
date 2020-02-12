package Day11_07;

public class ColorTV extends TV {
	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	public int getColor() {
		return color;
	}

	public void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");
	}
}
