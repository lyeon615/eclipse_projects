package chap02;

import java.util.Random;
import java.util.Scanner;

// �迭�� �̿��ؼ� Ű�� �ִ��� ��Ÿ���ÿ�
// ������� Ű���� ������ �����Ͻÿ�
public class Q01 {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 1 ; i < a.length; i++) {
			if(a[i] > max)
				max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("Ű�� �ִ��� ���Ͻÿ�");
		int num = rand.nextInt(11);
		System.out.println("����� : " + num);

		int height[] = new int[num];
		System.out.println("Ű�� ���� �Ʒ��� ����");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(91);
			System.out.println("height[" + i + "] = " + height[i]);
		}
		System.out.println("�ִ��� " + maxOf(height) + "�̴�.");

		sc.close();
	}
}