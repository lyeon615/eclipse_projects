package chap01;

import java.util.Scanner;

public class Gauss {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1���� n������ ���� ������");
		System.out.print("n�� �� : ");
		int n = sc.nextInt();
	
		int gauss = (1+n)*(n/2);
		System.out.print("1���� "+ n + "���� ������ ����" + gauss + "�̴�.");

		sc.close();
	}
	
	

}
