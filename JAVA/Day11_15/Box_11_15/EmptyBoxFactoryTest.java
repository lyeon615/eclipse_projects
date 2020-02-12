package Box_11_15;

public class EmptyBoxFactoryTest {
	public static void main(String[] args) {
		Box<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
		//���� �����ε� �Ʒ�ó�� �����ص� �����Ϸ��� �ڵ����� ���� ���ʸ�Ÿ���� �־ ������ ������ ������ ó������
		Box<String> sBox = EmptyBoxFactory.makeBox();
		
		//��ó�� ���������� Box<Integer>�� ������� makeBox �޼ҵ��� T�� �����ϴ� ���� Ÿ��Ÿ���̶�� �Ѵ�.
		
		
		iBox.set(25);
		System.out.println(iBox.get());
		
		sBox.set("How are you doing");
		System.out.println(sBox.get());
				
	}
}
