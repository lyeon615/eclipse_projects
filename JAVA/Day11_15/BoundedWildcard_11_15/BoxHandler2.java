package BoundedWildcard_11_15;

public class BoxHandler2 {
	public static void outBox(Box<? extends Toy> box) {
		Toy t = box.get();
		System.out.println(t);
		//box.set(new Toy()); // �ּ��� Ǯ�� ������ �߻��Ѵ�
	}
	public static void inBox(Box<? super Toy> box, Toy n) {
		box.set(n);
		//Toy t = box.get(); // �ּ��� Ǯ�� ������ �߻��Ѵ�
	}
}
