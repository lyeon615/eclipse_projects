package Day11_08;

import java.util.Scanner;

public class CalcTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calc calc = new Add();
		calc = new Sub();
		calc = new Mul();
		calc = new Div();
		
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = sc.next();
		
		calc.setValue(a, b);
		
		switch(c) {
		case "+" :
			System.out.println(((Add)calc).calculate());
		case "-" :
			System.out.println(((Sub)calc).calculate());
		case "*" :
			System.out.println(((Mul)calc).calculate());
		case "/" :
			System.out.println(((Div)calc).calculate());
			
			
			
		}
		
		
		sc.close();
	}
}
