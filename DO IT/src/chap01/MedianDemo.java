package chap01;
//세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하세요
import java.util.Scanner;

public class MedianDemo {

	public static int med3(int a, int b, int c) {
		if (a>= b) {
			if(b>=c)
				return b;
			else if(a>=c)
				return c;
			else
				return a;
		}else if(a>=c) {
			return a;
		}else if(b>=c) {
			return c;
		}else
			return b;	
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 정수의 중앙값은");
		System.out.print("a");
		int a = sc.nextInt();
		System.out.print("b");
		int b = sc.nextInt();
		System.out.print("c");
		int c = sc.nextInt();
		System.out.println("세 정수의 중앙값은 " + med3(a, b , c) + "이다.");

		sc.close();
	}
}
/*아래처럼 중앙값을 구하는 메소드의 다른 방법도 있지만 효율이 떨어진다 그 이유는?
 * static int med3(int a, int b, int c) {
 * if((b>=a && c<=a)|| (b<=a && c>=a))
 *    return a;
 * else if ((a>b && c<b || a<b && c>b))
 *    return b;
 * return ;
 *
 *|| 으로 작동하기 때문에 동작이 더 길어진다.
 * */
