package Day11_11;

import java.util.Scanner;

public class MyExceptionClass {
	public static void main(String[] args) {
		System.out.print("���� �Է� : ");
		try {
			int age = readAge();
			System.out.println("�Էµ� ���� : " + age);
		} catch (ReadAgeException e) {
			System.out.println(e.getMessage());
		}
	}

	public static int readAge() throws ReadAgeException {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age < 0)
			throw new ReadAgeException();

		return age;
	}	
	
}

class ReadAgeException extends Exception {
	public ReadAgeException() {
		super("��ȿ���� ���� ���̰� �ԷµǾ����ϴ�.");
	}
}