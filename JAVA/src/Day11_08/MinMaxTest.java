package Day11_08;

public class MinMaxTest {

	public static void main(String[] args) {
		IMinMax mm = new MinMax();

		double[] arr = { 8.0, 7.2, 3.1, -2.4, 0 };

		System.out.println("ÃÖ´ñ°ª " + mm.max(arr));
		System.out.println("ÃÖ¼Ú°ª " + mm.min(arr));
	}

}
