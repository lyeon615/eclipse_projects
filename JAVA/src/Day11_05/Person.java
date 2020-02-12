package Day11_05;

class Person {
	private int regiNum;
	private int passNum;

	Person(int rnum, int pnum) {
		regiNum = rnum;
		passNum = pnum;
	}

	Person(int rnum) {
		regiNum = rnum;
		passNum = 0;
	}

	void showPersonalInfo() {
		if (passNum == 0)
			System.out.println("주민번호 : " + regiNum + " 여권이 없습니다");
		else
			System.out.println("주민번호 : " + regiNum + " 여권번호 : " + passNum);
	}
}
