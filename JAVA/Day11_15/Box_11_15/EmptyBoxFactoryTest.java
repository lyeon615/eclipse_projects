package Box_11_15;

public class EmptyBoxFactoryTest {
	public static void main(String[] args) {
		Box<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
		//위가 정석인데 아래처럼 생략해도 컴파일러가 자동으로 앞의 제너릭타입을 넣어서 문법적 오류가 없으면 처리해줌
		Box<String> sBox = EmptyBoxFactory.makeBox();
		
		//이처럼 참조변수형 Box<Integer>를 기반으로 makeBox 메소드의 T를 결정하는 것을 타겟타입이라고 한다.
		
		
		iBox.set(25);
		System.out.println(iBox.get());
		
		sBox.set("How are you doing");
		System.out.println(sBox.get());
				
	}
}
