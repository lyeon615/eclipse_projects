package java_bank;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("����, ����, ���� ������ 3���� ���� �Է�");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();

		Grade me = new Grade(math, science, english);
	
		System.out.println("�����" + me.average());

		sc.close();
	}

}
