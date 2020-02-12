package Stream_11_20;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write7ToFile {
	public static void main(String[] args) throws IOException {
		//FileOutputStream 은 Exception을 상속받기 때문에 예외처리를 해주어야 한다.
		OutputStream out = new FileOutputStream("data.dat");//파일 생성
		out.write(7);
		out.close();
		
	}
}
