package chap01;
//~n까지의 숫자 합
import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 숫자의 합");
		System.out.println("n의 값");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum += i;
			i++;			
			
		}		
		System.out.println("1부터 "+ n + "까지 숫자의 합은" + sum + "이다.");
		System.out.println("while문이 종료될 때 i의 값은" + i + "로 n+1 값이다.");

		sc.close();
	}
}
