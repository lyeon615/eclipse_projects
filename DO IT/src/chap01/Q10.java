package chap01;

import java.util.Scanner;

//�� ���� a, b�� ������ �Է��ϰ� b-a�� ����ϱ� / ���� b�� �Է��� ���� a���� ���� ��� �ٽ� �Է��ϰ� �Ͻÿ�
public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("a�� ���� �Է��Ͻÿ�");
		a = sc.nextInt();
		
		
		do {
			System.out.println("b�� ���� �Է��Ͻÿ�");
			b = sc.nextInt();
		}while(a>=b);
		
		System.out.println("b-a = " + (b-a));

		
		sc.close();
	}
}
