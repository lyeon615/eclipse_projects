package BoundedWildcard_11_15;

public class BoxHandler2 {
	public static void outBox(Box<? extends Toy> box) {
		Toy t = box.get();
		System.out.println(t);
		//box.set(new Toy()); // 주석을 풀면 에러가 발생한다
	}
	public static void inBox(Box<? super Toy> box, Toy n) {
		box.set(n);
		//Toy t = box.get(); // 주석을 풀면 에러가 발생한다
	}
}
