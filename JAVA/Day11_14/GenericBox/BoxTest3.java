package GenericBox;

public class BoxTest3 {
	public static void main(String[] args) {
		Box<String> sBox = new Box<String>();
		sBox.set("I'm so sorry");
		
		//제너릭도 하나의 타입임을 알 수 있다.
		
		Box<Box<String>> wBox = new Box<Box<String>>();
		wBox.set(sBox);
		
		Box<Box<Box<String>>> zBox = new Box<Box<Box<String>>>(); 
		zBox.set(wBox);
		
		System.out.println(zBox.get().get().get());
	}
}
