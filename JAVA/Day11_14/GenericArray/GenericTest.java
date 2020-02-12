package GenericArray;

public class GenericTest {

	public static void main(String[] args) {
		GArray<String> gt = new GArray<String>();
		String[] ss = { "바나나", "우유", "스택", "어린쥐", "아아" };
		gt.setArr(ss);
		gt.printArr();
		
		GArray<Integer> it = new GArray<Integer>();
		Integer[] ii = { 1, 2, 3, 4, 5, 7};
		
		it.setArr(ii);
		System.out.println( );
		it.printArr();	
	
	}
}
