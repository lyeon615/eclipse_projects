package Box_11_15;

public class ToyTest {
	public static void main(String[] args) {
		GBox<Toy> box = new GBox<Toy>();
		box.set(new Toy());
		
		//GBox<T>�� Getable<T>�� �����ϹǷ� ���� ����
		Getable<Toy> gt = box;
		System.out.println(gt.get());
	}
}
