
public class IntegerLiterals {
	public static void main(String[] args) {
		int num1 = 123;
		int num2 = 0123;
		int num3 = 0x123;

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		
		System.out.println("11 + 22 + 33 = " + (11 + 22 + 33));
		System.out.println("011 + 022 + 033  = " + (011 + 022 + 033));
		System.out.println("0x11 + 0x22 + 0x33 = " + (0x11 + 0x22 + 0x33));
		
		byte seven = 0B111;
		int num205 = 0B11001101;
		
		System.out.println(seven);
		System.out.println(num205);

		int num = 100_000_000; //���ϴ� ��ġ�� ����� ��� ����, �ƹ��� �ǹ� ���� ���ڰ� Ŀ�� �� ���� ������,, ǥ�ÿ�
		System.out.println(num);

		double a = 3.4e3; // e�� 10�� �ǹ� / �� 3.4 ���ϱ� 10�� 3����
		System.out.println(a);

	}
}
