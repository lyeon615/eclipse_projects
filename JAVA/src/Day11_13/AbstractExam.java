package Day11_13;

public class AbstractExam {
	public static void main(String[] args) {
		Integer num1 = new Integer(29);
		System.out.println(num1.intValue());
		System.out.println(num1.doubleValue());
		
		Double num2 = 3.14; //���� �ڽ�
		System.out.println(num2.intValue());
		System.out.println(num2.doubleValue());
		
		
		
		//valueOf() �����ε� �Լ�
		Integer n1 = Integer.valueOf(5); //���� ��� Integer �ν��Ͻ� ����
		Integer n2 = Integer.valueOf("1024"); //���ڿ� ��� Integer �ν��Ͻ� ����
		
		//��� �񱳿� ���� ����ϴ� Ŭ���� �޼ҵ�
		System.out.println("ū �� " + Integer.max(n1, n2));
		System.out.println("���� �� " + Integer.min(n1, n2));
		System.out.println("�� " + Integer.sum(n1, n2));
		
		//������ ���� 2��, 8��, 16���� ǥ�� ����� ��ȯ�ϴ� Ŭ���� �޼ҵ�
		System.out.println("12�� 2�� ǥ��: " + Integer.toBinaryString(12));
		System.out.println("12�� 8�� ǥ��: " + Integer.toOctalString(12));
		System.out.println("12�� 16�� ǥ��: " + Integer.toHexString(12));
	}
}
