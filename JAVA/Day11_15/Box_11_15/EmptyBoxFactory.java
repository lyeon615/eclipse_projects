package Box_11_15;

public class EmptyBoxFactory {
	public static <T> Box<T> makeBox(){
		Box<T> box = new Box<T>();
		return box;
	} //���ʸ�Ÿ���� ��ȯ�ϴ� �޼��� / Ÿ�� �տ� <T>�� �ٿ��� ǥ�����ش�. 
}
