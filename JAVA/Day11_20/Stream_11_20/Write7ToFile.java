package Stream_11_20;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write7ToFile {
	public static void main(String[] args) throws IOException {
		//FileOutputStream �� Exception�� ��ӹޱ� ������ ����ó���� ���־�� �Ѵ�.
		OutputStream out = new FileOutputStream("data.dat");//���� ����
		out.write(7);
		out.close();
		
	}
}
