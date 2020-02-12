package Stream_11_20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class ByteStreamBasic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ����: ");
		String src = sc.nextLine();
		System.out.print("�纻 �̸�: ");
		String dst = sc.nextLine();
		
		try(InputStream in = new FileInputStream(src);
				OutputStream out = new FileOutputStream(dst)){
			int data;
			while(true) {
				data = in.read(); // ���Ϸκ��� 1����Ʈ �д´�.
				if(data == -1) //�� �̻� ���� �����Ͱ� ���� ��
					break;
				out.write(data);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
