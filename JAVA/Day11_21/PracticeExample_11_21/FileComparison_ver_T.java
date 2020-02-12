package PracticeExample_11_21;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileComparison_ver_T {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��� ����1 : ");
		String src1 = sc.nextLine();
		System.out.print("��� ����2 : ");
		String src2 = sc.nextLine();

		boolean equal = false;
		try (BufferedInputStream f1 = new BufferedInputStream(new FileInputStream(src1.trim()));
				BufferedInputStream f2 = new BufferedInputStream(new FileInputStream(src2.trim()))) {

			int data1, data2;
			//
			if (f1.available() != f2.available()) {
				equal = false;
				System.out.println("���� ���̰� �ٸ��ϴ�.");
			} else {
				equal = true;

				while ((data1 = f1.read()) != -1) {
					data2 = f2.read();
					if (data1 != data2) { // �߰��� �� ���ڶ� �ٸ���
						equal = false; // �� ������ ���� �ʴ�
						break; // while�� ����������
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		if (equal == true)
			System.out.println("������ �����ϴ�.");
		else
			System.out.println("������ ���� �ٸ��ϴ�.");

		sc.close();
	}
}
