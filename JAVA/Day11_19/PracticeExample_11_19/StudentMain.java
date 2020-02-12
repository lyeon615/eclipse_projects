package PracticeExample_11_19;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Student> info = new ArrayList<Student>();

		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");

		while (info.size() < 4) {
			System.out.print(">>");
			String input = sc.nextLine();
			StringTokenizer st1 = new StringTokenizer(input, ", ");
			
		//	while (st1.hasMoreTokens()) {
				String name = st1.nextToken();
				String subject = st1.nextToken();
				String num = st1.nextToken();
				String grades = st1.nextToken();
				Student a = new Student(name, subject, num, grades);
				info.add(a);
			//}
		}
		System.out.println("-----------------------");

		for (int j = 0; j < info.size(); j++) {
			System.out.println(info.get(j)); // 주소값이 나오기 때문에 Student클래스에서 toString오버라이딩
			System.out.println();
		}
		sc.close();
	}
}
