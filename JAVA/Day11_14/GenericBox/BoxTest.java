package GenericBox;

public class BoxTest {
	public static void main(String[] args) {
		Box aBox = new Box();
		Box oBox = new Box();
		
		aBox.set(new Apple()); 
		oBox.set(new Orange());
		
		Apple ap = (Apple)aBox.get();
		Orange og = (Orange)oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
		
		//���ڿ� ���� ��ü ��ſ� ���ڿ��� ����
		//aBox.set("Apple"); 
		//oBox.set("Orange");
		
		// ���ڿ� ���� ��ü�� ���µ� ���ϰ�ü�� ȣ���ϰ� �ִ�.
		// �ּ� Ǯ�� ����� Ŭ����ĳ��Ʈ���� �߻�
		//Apple ap = (Apple)aBox.get();
		//Orange og = (Orange)oBox.get();
       
		//���ڿ� ���� ��ü�� ���µ� ���� ���ڿ��� ����Ѵ�.
		//���α׷����� �Ǽ��� ���� ������������ ������ ����
		//System.out.println(aBox.get());
		//System.out.println(oBox.get());	
	}
}
