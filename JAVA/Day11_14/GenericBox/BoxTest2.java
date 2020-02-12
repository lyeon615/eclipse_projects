package GenericBox;

public class BoxTest2 {
	public static void main(String[] args) {
		
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple ap2 = aBox.get(); //형변환해주지 않아도 굿
		Orange og2 = oBox.get();
		
		System.out.println(ap2);
		System.out.println(og2);
	}
}
