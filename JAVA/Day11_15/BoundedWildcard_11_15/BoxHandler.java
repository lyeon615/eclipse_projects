package BoundedWildcard_11_15;

public class BoxHandler {
	
	public static void outBox(Box<Toy> box) {
		Toy t = box.get();
		System.out.println(t);
		box.set(new Toy()); // �ڽ����� ������ �ϴµ� �ִ� ��
	}
	public static void inBox(Box<Toy> box, Toy n) {
		box.set(n);
		Toy t = box.get(); // �ڽ��� �־�� �ϴµ� ������ ��
	}
	
	//���� �޼ҵ�� ����ڰ� ���� ��ɰ��� ���� ���� �ʴ� ����� �Ѵ�.
	//������ �ٸ��⿡ �߸��� �Լ������� �ƹ��� ������ ���� �ʴ´�. 
}
