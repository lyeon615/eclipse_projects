package Stream_11_20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Read7FromFile3 {
	public static void main(String[] args) {
		// try-with-resources는 try(...)에서 선언된 객체들에 대해서 try가 종료될 때 자동으로 지원을 해제해주는 기능
		// try에서 선언된 객체가 InputStream을 구현하였다면 try구문이 종료될 때 객체의 close() 메소드를 호출한다.
		try (InputStream in = new FileInputStream("data.dat")) {
			int dat = in.read();
			System.out.println(dat);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
