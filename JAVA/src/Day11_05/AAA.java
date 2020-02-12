package Day11_05;

class AAA {
	static int num = 0;
	static void addNum(int n) {
		num += n; // 
	}
	/*
	int num = 0;
	static void addNum(int n) {
		num += n; // static 메소드 안에 인스턴스 메소드 넣을 수 없어 왜?
		//static 은 인스턴스 생성없이 호출이 가능하고 인스턴스 변수는 그게 안 되기 때문에 
	}*/
}

