package Box_11_15;

public class SteelBoxTest {
	public static void main(String[] args) {
		Box<Integer> iBox = new SteelBox<Integer>(7959);
		
		Box<String> sBox = new SteelBox<String>("Simple");
		//구현할 때 부모의 제너릭타입과 자식의 제너릭타입이 같아야 한다.
		//같지 않으면 컴파일에러 
		//상식적으로 SteelBox의 o와 Box의 ob가 타입이 달라지면 대입이 안 되니까 
		
		System.out.println(iBox.get());
		System.out.println(sBox.get());
	}
}
