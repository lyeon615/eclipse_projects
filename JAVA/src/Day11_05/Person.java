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
			System.out.println("�ֹι�ȣ : " + regiNum + " ������ �����ϴ�");
		else
			System.out.println("�ֹι�ȣ : " + regiNum + " ���ǹ�ȣ : " + passNum);
	}
}
