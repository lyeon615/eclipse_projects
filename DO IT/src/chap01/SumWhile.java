package chap01;
//~n������ ���� ��
import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ������ ��");
		System.out.println("n�� ��");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum += i;
			i++;			
			
		}		
		System.out.println("1���� "+ n + "���� ������ ����" + sum + "�̴�.");
		System.out.println("while���� ����� �� i�� ����" + i + "�� n+1 ���̴�.");

		sc.close();
	}
}