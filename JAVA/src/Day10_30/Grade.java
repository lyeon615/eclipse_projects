package Day10_30;

public class Grade {
		
	public static void main(String[] args) {
		int kor = 60;
		int math = 70;
		int eng = 100;

		int total = (kor + math + eng);
		double avg = total / 3.0;

		int n = kor;
		System.out.print("���� ���� : ");
		if (n >= 90) {
			System.out.println("��");
		} else if (n >= 80) {
			System.out.println("��");
		} else if (n >= 70) {
			System.out.println("��");
		} else if (n >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
		
		n = math;
		System.out.print("���� ���� : ");
		if (n >= 90) {
			System.out.println("��");
		} else if (n >= 80) {
			System.out.println("��");
		} else if (n >= 70) {
			System.out.println("��");
		} else if (n >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
		
		
		n = eng;
		System.out.print("���� ���� : ");
		if (n >= 90) {
			System.out.println("��");
		} else if (n >= 80) {
			System.out.println("��");
		} else if (n >= 70) {
			System.out.println("��");
		} else if (n >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
		
		n = (int)avg;
		System.out.print("�� ���� : ");
		if (n >= 90) {
			System.out.println("��");
		} else if (n >= 80) {
			System.out.println("��");
		} else if (n >= 70) {
			System.out.println("��");
		} else if (n >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
	
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
	}
}
