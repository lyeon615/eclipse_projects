package GenericArray;

public class GenericTest {

	public static void main(String[] args) {
		GArray<String> gt = new GArray<String>();
		String[] ss = { "�ٳ���", "����", "����", "���", "�ƾ�" };
		gt.setArr(ss);
		gt.printArr();
		
		GArray<Integer> it = new GArray<Integer>();
		Integer[] ii = { 1, 2, 3, 4, 5, 7};
		
		it.setArr(ii);
		System.out.println( );
		it.printArr();	
	
	}
}
