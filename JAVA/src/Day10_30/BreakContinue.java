package Day10_30;

public class BreakContinue {
	public static void main(String[] args) {
		int num = 1;
		boolean search = false;

		while (num < 100) {
			if (((num % 5) == 0) && ((num % 7) == 0)) {
				search = true;
				break;
			}
			num++;
		}
		if (search)
			System.out.println("5�� 7�� �ּҰ���� : " + num);
		else
			System.out.println("100 �̸��� 5�� 7�� ������� ã�� ���߽��ϴ�.");

		num = 0;
		int count = 0;
		System.out.println("100 �̸��� 5�� 7�� ����� ");
		while ((num++) < 100) {
			if (((num % 5) != 0) || ((num % 7) != 0)) {
				continue;
			}
			count++;
			System.out.println(num);
		}
		System.out.println("count: " + count);
	}
}
