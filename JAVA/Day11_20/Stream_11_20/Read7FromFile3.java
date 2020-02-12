package Stream_11_20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Read7FromFile3 {
	public static void main(String[] args) {
		// try-with-resources�� try(...)���� ����� ��ü�鿡 ���ؼ� try�� ����� �� �ڵ����� ������ �������ִ� ���
		// try���� ����� ��ü�� InputStream�� �����Ͽ��ٸ� try������ ����� �� ��ü�� close() �޼ҵ带 ȣ���Ѵ�.
		try (InputStream in = new FileInputStream("data.dat")) {
			int dat = in.read();
			System.out.println(dat);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
