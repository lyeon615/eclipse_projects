package Day11_05;

class TestClass {
	void instanceMethod() {}
	static void staticMethod() {}
	
	void instanceMethod2() {
		instanceMethod();
		staticMethod();
	}
	static void staticMethod2() {
		//instanceMethod(); //��� ������ ���� �ֳ�? ����ƽ �Լ� �ȿ��� �ν��Ͻ� ����� �ü� ����! ^^*
		staticMethod();
	}
	
}
