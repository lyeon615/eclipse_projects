package chap01;

public class Max4 {
	
	public static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		if(d > max)
			max = d;
		
		return max;
	}
	
	public static int min3(int a, int b, int c) {
		int min = a;
		if(b < min)
			min = b;
		if(c < min)
			min = c;
		return min;
	}
	
	public static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b < min)
			min = b;
		if(c < min)
			min = c;
		if(d < min)
			min = d;
		return min;
	}

	public static void main(String[] args) {
		System.out.println("max4(5, 8, 3, 9) = " +max4(5, 8, 3, 9));
		System.out.println("max4(2, 5, 2, 3) = " +max4(2, 5, 2, 3));
		System.out.println("min3(5, 8, 3) = " +min3(5, 8, 3));
		System.out.println("min3(2, 3, 2) = " +min3(2, 3, 2));
		System.out.println("min4(5, 8, 3, 1) = " + min4(5, 8, 3, 1));
		System.out.println("min4(2, 4, 9, -2) = " + min4(2, 4, 9, -2));
		}

}
