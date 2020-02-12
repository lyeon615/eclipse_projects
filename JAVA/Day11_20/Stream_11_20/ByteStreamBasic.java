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
		System.out.print("대상 파일: ");
		String src = sc.nextLine();
		System.out.print("사본 이름: ");
		String dst = sc.nextLine();
		
		try(InputStream in = new FileInputStream(src);
				OutputStream out = new FileOutputStream(dst)){
			int data;
			while(true) {
				data = in.read(); // 파일로부터 1바이트 읽는다.
				if(data == -1) //더 이상 읽을 데이터가 없을 때
					break;
				out.write(data);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
