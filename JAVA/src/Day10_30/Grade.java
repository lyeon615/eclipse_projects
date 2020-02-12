package Day10_30;

public class Grade {
		
	public static void main(String[] args) {
		int kor = 60;
		int math = 70;
		int eng = 100;

		int total = (kor + math + eng);
		double avg = total / 3.0;

		int n = kor;
		System.out.print("국어 점수 : ");
		if (n >= 90) {
			System.out.println("수");
		} else if (n >= 80) {
			System.out.println("우");
		} else if (n >= 70) {
			System.out.println("미");
		} else if (n >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
		
		n = math;
		System.out.print("수학 점수 : ");
		if (n >= 90) {
			System.out.println("수");
		} else if (n >= 80) {
			System.out.println("우");
		} else if (n >= 70) {
			System.out.println("미");
		} else if (n >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
		
		
		n = eng;
		System.out.print("영어 점수 : ");
		if (n >= 90) {
			System.out.println("수");
		} else if (n >= 80) {
			System.out.println("우");
		} else if (n >= 70) {
			System.out.println("미");
		} else if (n >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
		
		n = (int)avg;
		System.out.print("총 평점 : ");
		if (n >= 90) {
			System.out.println("수");
		} else if (n >= 80) {
			System.out.println("우");
		} else if (n >= 70) {
			System.out.println("미");
		} else if (n >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
	
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}
}
