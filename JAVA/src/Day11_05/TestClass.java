package Day11_05;

class TestClass {
	void instanceMethod() {}
	static void staticMethod() {}
	
	void instanceMethod2() {
		instanceMethod();
		staticMethod();
	}
	static void staticMethod2() {
		//instanceMethod(); //얘는 에러가 나지 왜냐? 스태틱 함수 안에는 인스턴스 멤버가 올수 없어! ^^*
		staticMethod();
	}
	
}
