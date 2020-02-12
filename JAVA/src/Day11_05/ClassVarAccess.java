package Day11_05;

public class ClassVarAccess {
	public static void main(String[] args) {
		AccessWay a = new AccessWay();
		a.num++;  // 이렇게 접근도 가능하지만 공용변수이기 때문에 아래와 같이 클래스명으로 접근하는 게 가장 좋다.
		AccessWay.num++;
		System.out.println("num = " + AccessWay.num);
	}
}
