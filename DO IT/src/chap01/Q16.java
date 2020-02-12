package chap01;

import java.util.Scanner;

//n���� * �Ƕ�̵� ���
//i�࿡ (i-1)*2+1���� ��ȣ���� *�� ��µǰ� �Ͻÿ�
//������ n�࿡�� (n-1)*2+1���� ��ȣ���� *�� ����ϰ� �˴ϴ�.
//���� �Ƕ�̵� �ۼ� 
//  1
// 222
//33333
public class Q16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �Ƕ�̵� ���\n�� ��? ");
		int n = sc.nextInt();
		spira(n);
		
		npira(n);

		sc.close();
	}

	public static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (int j = 1; j <= (i * 2 - 1); j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void npira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1 ; j <= n-i ; j++)
				System.out.print(" ");
			for(int j = 1 ; j <= (i*2 - 1) ; j++)
				System.out.print(i%10);
			System.out.println();

		}
	}

}
