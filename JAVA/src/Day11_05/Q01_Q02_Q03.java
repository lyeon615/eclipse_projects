package Day11_05;

public class Q01_Q02_Q03 {
	public static void main(String[] args) {
		System.out.println(max4(3,4,1,6));
		System.out.println(min3(-9,4,1));
		System.out.println(min4(9,1,2,0));
	}
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;
		return max;
	}

	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		return min;
	}

	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		if (d < min)
			min = d;
		return min;
	}

}
