package Day11_12;

public class PersonTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Person p1 = new Person("Yoon");
		Person p2 = new Person("Park");
		p1 = null; // �̹� ������ �ν��Ͻ��� �Ҹ��Ű�� ������ ���
		p2 = null;
		System.gc(); // gc �� �޸� ���� ����� �� �� gc�� �ٷ� �޸𸮸� �������� ����. 
		System.runFinalization();
		
		System.out.println("end of program");
	}
}

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("destroyed: " + name);
	}
}