package chap01;

import java.util.Scanner;

//���� ������ �Է��ϰ� �ڸ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
//���� 135 �Է½� '�� ���� 3�ڸ��Դϴ�.' ��� 1314 �Է½� '�� ���� 4�ڸ��Դϴ�.'��� ���
public class Q11 {

	public static int number(int num) {

		int i = 0;

		while (true) {
			if (num < 0) {
				num = -num;
			}
			num /= 10;
			i++;
			if (num <= 0) {
				break;
			}
		}
		return i;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� �Է��Ͻÿ�");
		int num = sc.nextInt();

		System.out.println("�� ����" + number(num) + "�ڸ����Դϴ�.");
		sc.close();
	}
}
