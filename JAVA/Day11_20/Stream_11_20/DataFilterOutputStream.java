package Stream_11_20;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataFilterOutputStream {
	public static void main(String[] args) {
		try(DataOutputStream out = new DataOutputStream(new FileOutputStream("data.dat"))) {
			out.writeInt(2100000000);
			out.writeDouble(3.14);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
