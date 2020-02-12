package Stream_11_20;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write7ToFile3 {
	public static void main(String[] args) {
		try(OutputStream out = new FileOutputStream("data.txt")){
			out.write(94662);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
