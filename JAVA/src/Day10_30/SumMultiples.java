package Day10_30;

public class SumMultiples {

	public static void main(String[] args) {

		int sum = 0;
		// 1.1���� 100������ ������ ����
		System.out.println("1���� 100������ ������ ����?");
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		// 2.1���� 100������ ���� �� 3�� �����
		System.out.println("1���� 100������ ���� �� 3�� �����?");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

		// 3.1���� 100������ ���� �� Ȧ���� ����
		sum = 0;
		System.out.println("\n1���� 100������ ���� �� Ȧ���� ����?");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);

		// 4.������ 7���� ����Ͻÿ�
		System.out.println("������ 7���� ����Ͻÿ�");

		int dan = 7;
		for (int i = 1; i <= 9; i++) {
			int j = i * dan;
			System.out.println(dan + " x " + i + " = " + j);
		}
	}
}