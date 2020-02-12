package Day11_12;

public class PersonTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Person p1 = new Person("Yoon");
		Person p2 = new Person("Park");
		p1 = null; // 이미 생성된 인스턴스를 소멸시키는 유일한 방법
		p2 = null;
		System.gc(); // gc 의 메모리 삭제 대상이 될 뿐 gc가 바로 메모리를 삭제하지 않음. 
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