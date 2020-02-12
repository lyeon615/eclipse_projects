package PracticeExample_11_21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SmallToCapital_ver_T {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("대상 파일 : ");
		String src = sc.nextLine();
		
		System.out.print("사본 이름 : ");
		String dst = sc.nextLine();
		
		try(BufferedReader in = new BufferedReader(new FileReader(src));
				BufferedWriter out = new BufferedWriter(new FileWriter(dst))){
			
			int data;
			while((data = in.read())!= -1) {
				if(data >= 97 && data <= 122) {
					out.write((char)(data-32));
					System.out.print((char)(data-32));
				}else {
					out.write(data);
					System.out.print((char)data);
				}
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}
