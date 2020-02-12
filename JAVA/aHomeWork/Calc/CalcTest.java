package Calc;

import java.util.Scanner;

public class CalcTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int retry = 0;
		try {
			do {
				System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
				int a = sc.nextInt();
				int b = sc.nextInt();
				String c = sc.next();

				switch (c) {
				case "+":
					Calc calc = new Add();
					calc.setValue(a, b);
					System.out.println(calc.calculate());
					break;
				case "-":
					calc = new Sub();
					calc.setValue(a, b);
					System.out.println(calc.calculate());
					break;
				case "*":
					calc = new Mul();
					calc.setValue(a, b);
					System.out.println(calc.calculate());
					break;
				case "/":
					calc = new Div();
					calc.setValue(a, b);
					System.out.println(calc.calculate());
					break;
				}

				System.out.print("�ٽ� �Ͻðھ��? 1)yes 0)no");
				retry = sc.nextInt();
			} while (retry == 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
