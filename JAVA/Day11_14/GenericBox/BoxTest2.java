package GenericBox;

public class BoxTest2 {
	public static void main(String[] args) {
		
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple ap2 = aBox.get(); //����ȯ������ �ʾƵ� ��
		Orange og2 = oBox.get();
		
		System.out.println(ap2);
		System.out.println(og2);
	}
}
