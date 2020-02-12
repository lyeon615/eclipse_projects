package Stream_11_20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Read7FromFile2 {
	// �Լ� �ڿ� throws IOException �����߱� ������ try-catch ������ �ʿ����� �ʴ�.
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