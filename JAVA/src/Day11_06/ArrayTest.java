package Day11_06;

public class ArrayTest {
	public static void main(String[] args) {
		int[] ar1 = new int[5];
		double[] ar2 = new double[7];
		float[] ar3;
		ar3 = new float[9];
		
		System.out.println("�迭 ar1 ���� : " + ar1.length);
		System.out.println("�迭 ar2 ���� : " + ar2.length);
		System.out.println("�迭 ar3 ���� : " + ar3.length);
		
		
		System.out.println(Array.makeNewIntArray(5));
	}
	
}
class Array{
	static int[] makeNewIntArray(int len) {
		int[] ar = new int[len];
		return ar;
	}
	
}