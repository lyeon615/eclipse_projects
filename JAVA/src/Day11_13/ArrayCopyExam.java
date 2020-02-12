package Day11_13;

public class ArrayCopyExam {
	public static void main(String[] args) {
		double[] org = {1.1, 2.2, 3.3, 4.4, 5.5};
		double[] cpy = new double[3];
		
		for(double d : cpy)
			System.out.print(d + "\t");
		System.out.println();
		
		System.arraycopy(org, 1, cpy, 0, 3);
		
		for(double d : cpy)
			System.out.print(d + "\t");
		System.out.println();
	}
}
