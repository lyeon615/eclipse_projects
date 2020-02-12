package GenericBox;

public class DBoxTest {
	public static void main(String[] args) {

		// 앞에는 타입 적어줘야 하지만 뒤에 것 어차피 같아서 생략가능 그래도 적어주자
		DBox<String, Integer> box = new DBox</*String, Integer*/>();
		
		box.set("Apple", 25); // 오토박싱 
		System.out.println(box); //객체를 출력하기 위해서는 toString을 오버라이드해주어야 한다.
	}
}

class DBox<L, R> { // 제너릭은 두 개 이상 쓸 수도 있다. 단 int 같은 프리미티브는 안 되고 참조형 타입만 와야 된다.
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
