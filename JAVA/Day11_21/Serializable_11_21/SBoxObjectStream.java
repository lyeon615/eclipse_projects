package Serializable_11_21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SBoxObjectStream {
	public static void main(String[] args) {
		SBox box1 = new SBox("Robot");
		SBox box2 = new SBox("Strawberry");
		
		try(ObjectOutputStream oo = 
				new ObjectOutputStream(
						new FileOutputStream("Object.bin"))){
			
			oo.writeObject(box1);
			oo.writeObject(box2);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		box1 = new SBox("Bunny");
		
		try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream("Object.bin"))) {
			box1 = (SBox) oi.readObject();
			System.out.println(box1.get());
			box2 = (SBox) oi.readObject();
			System.out.println(box2.get());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
