package Day11_13;

import java.util.Random;

public class RandomExam {
	public static void main(String[] args) {
		Random rand = new Random(); // ������ ������ �ٸ� ����� �����ش�.
		// Random rand = new Random(12); //������ ������ ���� ����� �����ش�.
		for (int i = 0; i < 7; i++)
			System.out.println(rand.nextInt(1000));
	}
}
