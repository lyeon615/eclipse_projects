package chap01;
//�� ���� ��� ���� 13������ ��� ���տ� ���� �߾Ӱ��� ���Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���
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
		System.out.println("�� ������ �߾Ӱ���");
		System.out.print("a");
		int a = sc.nextInt();
		System.out.print("b");
		int b = sc.nextInt();
		System.out.print("c");
		int c = sc.nextInt();
		System.out.println("�� ������ �߾Ӱ��� " + med3(a, b , c) + "�̴�.");

		sc.close();
	}
}
/*�Ʒ�ó�� �߾Ӱ��� ���ϴ� �޼ҵ��� �ٸ� ����� ������ ȿ���� �������� �� ������?
 * static int med3(int a, int b, int c) {
 * if((b>=a && c<=a)|| (b<=a && c>=a))
 *    return a;
 * else if ((a>b && c<b || a<b && c>b))
 *    return b;
 * return ;
 *
 *|| ���� �۵��ϱ� ������ ������ �� �������.
 * */
