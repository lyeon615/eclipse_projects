package GenericBox;

public class BoxTest {
	public static void main(String[] args) {
		Box aBox = new Box();
		Box oBox = new Box();
		
		aBox.set(new Apple()); 
		oBox.set(new Orange());
		
		Apple ap = (Apple)aBox.get();
		Orange og = (Orange)oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
		
		//상자에 과일 객체 대신에 문자열을 담음
		//aBox.set("Apple"); 
		//oBox.set("Orange");
		
		// 상자에 과일 객체가 없는데 과일객체를 호출하고 있다.
		// 주석 풀고 실행시 클래스캐스트예외 발생
		//Apple ap = (Apple)aBox.get();
		//Orange og = (Orange)oBox.get();
       
		//상자에 과일 객체가 없는데 과일 문자열을 출력한다.
		//프로그래머의 실수가 실행 과정에서조차 보이지 않음
		//System.out.println(aBox.get());
		//System.out.println(oBox.get());	
	}
}
