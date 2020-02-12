
public class Casting {
	public static void main(String[] args) {
		double num1 = 3.0;
		double num2 = 4.0;
		
		double result = num1/num2;
		
		System.out.println(result);
		
		int num3 = 3;
		int num4 = 4;
		
		double result2 = (double)num3/num4;
		System.out.println(result2);

		int num5 = 3;
		int num6 = 4;
		
		double result3 = (double)(num5/num6);// 0이 나온다 왜? num5 num6괄호 먼저 계싼해서 이미 0이 되고 나서 형변환을 해주기 때문에 
		System.out.println(result3); 
	}
}
