package java_bank;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("수학, 과학, 영어 순으로 3개의 정수 입력");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();

		Grade me = new Grade(math, science, english);
	
		System.out.println("평균은" + me.average());

		sc.close();
	}

}
