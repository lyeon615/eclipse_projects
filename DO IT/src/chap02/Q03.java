package chap02;

import java.util.Random;

//�迭 a�� ��� ����� �հ踦 ���Ͽ� ��ȯ�ϴ� �޼ҵ带 �ۼ��Ͻÿ�
public class Q03 {
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}

	public static void main(String[] args) {
		Random rand = new Random();

		int num = rand.nextInt(10);
		int[] a = new int[num];

		for (int i = 0; i < num; i++) {
			a[i] = rand.nextInt(20);
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println("�迭 a�� ��� ����� ���� " + sumOf(a) + "�̴�");
	}
}
