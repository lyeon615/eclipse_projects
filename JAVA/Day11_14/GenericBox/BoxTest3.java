package GenericBox;

public class BoxTest3 {
	public static void main(String[] args) {
		Box<String> sBox = new Box<String>();
		sBox.set("I'm so sorry");
		
		//���ʸ��� �ϳ��� Ÿ������ �� �� �ִ�.
		
		Box<Box<String>> wBox = new Box<Box<String>>();
		wBox.set(sBox);
		
		Box<Box<Box<String>>> zBox = new Box<Box<Box<String>>>(); 
		zBox.set(wBox);
		
		System.out.println(zBox.get().get().get());
	}
}
