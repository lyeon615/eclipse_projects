package BoundedWildcard_11_15;

public class BoxHandler {
	
	public static void outBox(Box<Toy> box) {
		Toy t = box.get();
		System.out.println(t);
		box.set(new Toy()); // 박스에서 꺼내야 하는데 넣는 중
	}
	public static void inBox(Box<Toy> box, Toy n) {
		box.set(n);
		Toy t = box.get(); // 박스에 넣어야 하는데 꺼내는 중
	}
	
	//위의 메소드는 사용자가 원한 기능과는 전혀 맞지 않는 기능을 한다.
	//목적과 다르기에 잘못된 함수이지만 아무런 에러가 나지 않는다. 
}
