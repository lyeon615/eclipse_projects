package Box_11_15;

public class EmptyBoxFactory {
	public static <T> Box<T> makeBox(){
		Box<T> box = new Box<T>();
		return box;
	} //제너릭타입을 반환하는 메서드 / 타입 앞에 <T>를 붙여서 표시해준다. 
}
