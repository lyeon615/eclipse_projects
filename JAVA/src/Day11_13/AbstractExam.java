package Day11_13;

public class AbstractExam {
	public static void main(String[] args) {
		Integer num1 = new Integer(29);
		System.out.println(num1.intValue());
		System.out.println(num1.doubleValue());
		
		Double num2 = 3.14; //오토 박싱
		System.out.println(num2.intValue());
		System.out.println(num2.doubleValue());
		
		
		
		//valueOf() 오버로딩 함수
		Integer n1 = Integer.valueOf(5); //숫자 기반 Integer 인스턴스 생성
		Integer n2 = Integer.valueOf("1024"); //문자열 기반 Integer 인스턴스 생성
		
		//대소 비교와 합을 계산하는 클래스 메소드
		System.out.println("큰 수 " + Integer.max(n1, n2));
		System.out.println("작은 수 " + Integer.min(n1, n2));
		System.out.println("합 " + Integer.sum(n1, n2));
		
		//정수에 대한 2진, 8진, 16진수 표현 결과를 반환하는 클래스 메소드
		System.out.println("12의 2진 표현: " + Integer.toBinaryString(12));
		System.out.println("12의 8진 표현: " + Integer.toOctalString(12));
		System.out.println("12의 16진 표현: " + Integer.toHexString(12));
	}
}
