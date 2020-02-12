package GenericBox;

public class DBoxTest {
	public static void main(String[] args) {

		// �տ��� Ÿ�� ������� ������ �ڿ� �� ������ ���Ƽ� �������� �׷��� ��������
		DBox<String, Integer> box = new DBox</*String, Integer*/>();
		
		box.set("Apple", 25); // ����ڽ� 
		System.out.println(box); //��ü�� ����ϱ� ���ؼ��� toString�� �������̵����־�� �Ѵ�.
	}
}

class DBox<L, R> { // ���ʸ��� �� �� �̻� �� ���� �ִ�. �� int ���� ������Ƽ��� �� �ǰ� ������ Ÿ�Ը� �;� �ȴ�.
	private L left;
	private R right;

	public void set(L o, R r) {
		left = o;
		right = r;
	}

	@Override
	public String toString() {
		return left + " & " + right;
	}
}
