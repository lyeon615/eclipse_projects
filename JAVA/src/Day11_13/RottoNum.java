package Day11_13;

import java.util.Random;

public class RottoNum implements IRottoNum {

	private int[] num;

	RottoNum(int[] num) {
		this.num = num;
	}

	public int[] randomNum() {
		Random rand = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = 1 + rand.nextInt(45);
			for (int j = 0; j < i; j++) {
				while (num[i] == num[j]) {
					num[i] = 1 + rand.nextInt(45);
					System.out.println("�ߺ��Դϴ�." + i + "==" + j);
					j = 0;
				}
			}
		}
		return num;
	}

	/*
	// ����� ��� i�� ������ �극��ũ�� �ɾ ����������;
	public int[] randomNum() {
		Random rand = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = 1 + rand.nextInt(45);
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					System.out.println("�ߺ��Դϴ�." + i + "==" + j);
					break;
				}
			}
		}
		return num;
	}*/

	public static void main(String[] args) {
		int[] num = new int[6];
		RottoNum rotto = new RottoNum(num);
		rotto.randomNum();
		for (int i = 0; i < num.length; i++)
			System.out.println(num[i]);
	}
}
