package Stream_11_20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Read7FromFile2 {
	// 함수 뒤에 throws IOException 선언했기 때문에 try-catch 구문이 필요하지 않다.
	public static void main(String[] args) throws IOException {
		InputStream in = null;
		try {
			in = new FileInputStream("data.dat");
			int dat = in.read();
			System.out.println(dat);
		} finally {
			if (in != null)
				in.close();
		}
	}
}