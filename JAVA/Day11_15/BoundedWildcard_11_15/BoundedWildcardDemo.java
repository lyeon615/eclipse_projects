package BoundedWildcard_11_15;

public class BoundedWildcardDemo {

//	public static <T> Box<T> addBox(T result, T num1, T num2){
//		result = num1 + num2;	//The operator + is undefined for the argument type(s) T, T 컴파일 에러 확인됨
//	} 
	public static void addBox(Box<? super Integer> result,
			Box<? extends Integer> box1, Box<? extends Integer> box2) {
		result.set(box1.get() + box2.get());	
	}
	
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<Integer>();
		box1.set(24);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(37);
		
		Box<Integer> result = new Box<Integer>();
		result.set(0);
		
		addBox(result, box1, box2); //result에 box1+box2의 결과 저장
		System.out.println(result.get()); //61출력
		
	}
}
