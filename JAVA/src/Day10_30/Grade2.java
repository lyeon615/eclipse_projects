package Day10_30;

public class Grade2 {
	public static char grade(int n) {
		char grade = ' ';
		if (n >= 90) {
			grade = '수';
		} else if (n >= 80) {
			grade = '우';
		} else if (n >= 70) {
			grade = '미';
		} else if (n >= 60) {
			grade = '양';
		} else {
			grade = '가';
		}
		return grade;
	}

	public static void main(String[] args) {
		int kor = 60;
		int math = 70;
		int eng = 100;

		int total = (kor + math + eng);
		double avg = total / 3.0;

		System.out.println("국어 평점: " + grade(kor));
		System.out.println("수학 평점: " + grade(math));
		System.out.println("영어 평점: " + grade(eng));
		System.out.println("총 평점:  " + grade((int)avg));
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}
}
