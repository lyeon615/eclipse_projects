package Box_11_15;

public class ToyTest {
	public static void main(String[] args) {
		GBox<Toy> box = new GBox<Toy>();
		box.set(new Toy());
		
		//GBox<T>가 Getable<T>를 구현하므로 참조 가능
		Getable<Toy> gt = box;
		System.out.println(gt.get());
	}
}
