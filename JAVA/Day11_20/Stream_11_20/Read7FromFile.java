package Stream_11_20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Read7FromFile {
	public static void main(String[] args) throws IOException{
		InputStream in = new FileInputStream("data.dat");
		int dat = in.read();
		in.close();
		System.out.println(dat);
	}
}
