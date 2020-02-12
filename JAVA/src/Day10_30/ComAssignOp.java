package Day10_30;

public class ComAssignOp {
	public static void main(String[] args) {
		short num = 10;
		num = (short) (num + 77L);
		int rate = 3;
		rate = (int) (rate * 3.5);
		System.out.println(num);
		System.out.println(rate);

		
		//컴파일러가 명시적 형변환을 자동으로 해줌
		num = 10;
		num += 77L;
		rate = 3;
		rate *= 3.5;

		System.out.println(num);
		System.out.println(rate);
	}
}
