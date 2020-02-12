package Day11_12;

public class instanceCloning {
	public static void main(String[] args) {
		Point org = new Point(3, 5);
		Point cpy;
		
		try {
			cpy = (Point)org.clone();
			org.showPosition();
			cpy.showPosition();
			
			if(cpy.equals(org))
				System.out.println("cpy, org 주소 동일하다");
			else
				System.out.println("cpy, org 주소 다르다");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
class Point {
	private int xPos;
	private int yPos;
	
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}