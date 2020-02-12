package PracticeExample_11_21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileMerge_ver_Kong {	

	public static void main(String[] args) {
		try(BufferedReader in1 = new BufferedReader(new FileReader("a.txt"));
				BufferedReader in2 = new BufferedReader(new FileReader("b.txt"));
				BufferedWriter out = new BufferedWriter(new FileWriter("c.txt"))) {
				
				char[] ch = new char[10000];
				int i = 0;
				int data = 0;
				
				while((data = in1.read()) != -1) {				
					ch[i++] = (char)data;					
				}
				
				while((data = in2.read()) != -1) {				
					ch[i++] = (char)data;			
				}
				
				String s = new String(ch);
				
				out.write(s);
				System.out.println(s);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}	
	}
}
