package Box_11_15;

public class SteelBoxTest {
	public static void main(String[] args) {
		Box<Integer> iBox = new SteelBox<Integer>(7959);
		
		Box<String> sBox = new SteelBox<String>("Simple");
		//������ �� �θ��� ���ʸ�Ÿ�԰� �ڽ��� ���ʸ�Ÿ���� ���ƾ� �Ѵ�.
		//���� ������ �����Ͽ��� 
		//��������� SteelBox�� o�� Box�� ob�� Ÿ���� �޶����� ������ �� �Ǵϱ� 
		
		System.out.println(iBox.get());
		System.out.println(sBox.get());
	}
}
