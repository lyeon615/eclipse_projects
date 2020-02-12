package PracticeExample_11_21;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileComparison {
	public static void main(String[] args) {
		
		try(BufferedInputStream f1 = new BufferedInputStream(new FileInputStream("a.txt"));
				BufferedInputStream f2 = new BufferedInputStream(new FileInputStream("b.txt"))){
			
			int data1 = f1.read();
			int data2 = f2.read();
			
			if(data1 == data2)
				System.out.println("������ �����ϴ�.");
			else
				System.out.println("������ ���� �ٸ��ϴ�.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
