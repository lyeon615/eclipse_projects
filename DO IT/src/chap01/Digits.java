package chap01;

import java.util.Scanner;

//2�ڸ��� ���(10~99)�� �Է�����
public class Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		
		System.out.println("2�ڸ��� ���� ������ �Է��غ���");
		
		do {
			System.out.print("�Է� : ");
			no = sc.nextInt();
		}while((no < 10 || no > 99));
				
		System.out.println("2�ڸ��� ���� ���� " + no + "�� �Է��ϼ̽��ϴ�.");
		
		sc.close();
	}
}
