
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

		int num = 100_000_000; //원하는 위치에 언더바 사용 가능, 아무런 의미 없고 숫자가 커질 때 세기 쉬우라고,, 표시용
		System.out.println(num);

		double a = 3.4e3; // e는 10을 의미 / 즉 3.4 곱하기 10의 3제곱
		System.out.println(a);

	}
}
