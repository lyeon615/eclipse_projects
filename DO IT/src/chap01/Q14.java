package chap01;

import java.util.Scanner;

//�Է��� ���� �� ������ �ϴ� ���簢���� *��ȣ�� ����ϴ� ���α׷��� �ۼ��ϱ�
//�簢���� ����մϴ�
//�ܼ� 5
//*****
//*****
//*****
//*****
//*****
public class Q14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�簢���� ����մϴ�");
		System.out.print("�ܼ� : ");
		int side = sc.nextInt();

		String square = "";

		for (int i = 0; i < side; i++) {
			square += "* ";
		}
		for (int i = 0; i < side; i++) {
			System.out.println(square);
		}

		sc.close();
	}
}
