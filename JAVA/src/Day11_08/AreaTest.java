package Day11_08;

public class AreaTest {
	public static void main(String[] args) {
		IArea a = new AreaOfTriangle(2, 5);
		System.out.println("�ﰢ���� ���� : " + a.area());
		a.show();
		
		
		a = new AreaOfRectangle(10, 8.3);
		System.out.println("�簢���� ���� : " + a.area());
		a.show();
	}
}
