package Day10_30;

public class Grade2 {
	public static char grade(int n) {
		char grade = ' ';
		if (n >= 90) {
			grade = '��';
		} else if (n >= 80) {
			grade = '��';
		} else if (n >= 70) {
			grade = '��';
		} else if (n >= 60) {
			grade = '��';
		} else {
			grade = '��';
		}
		return grade;
	}

	public static void main(String[] args) {
		int kor = 60;
		int math = 70;
		int eng = 100;

		int total = (kor + math + eng);
		double avg = total / 3.0;

		System.out.println("���� ����: " + grade(kor));
		System.out.println("���� ����: " + grade(math));
		System.out.println("���� ����: " + grade(eng));
		System.out.println("�� ����:  " + grade((int)avg));
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
	}
}
