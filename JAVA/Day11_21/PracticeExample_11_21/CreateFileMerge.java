package PracticeExample_11_21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileMerge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("대상 파일1 : ");
		String src1 = sc.nextLine();
		System.out.print("대상 파일2 : ");
		String src2 = sc.nextLine();

		System.out.print("사본 이름 : ");
		String dst = sc.nextLine();

		try (BufferedReader in1 = new BufferedReader(new FileReader(src1));
				BufferedReader in2 = new BufferedReader(new FileReader(src2));
				BufferedWriter out = new BufferedWriter(new FileWriter(dst))) {
			
			int data;
			while((data = in1.read()) != -1) {
				out.write((char)data);
				System.out.print((char)data);
			}
			
			out.newLine();
			System.out.println();
			
			while((data = in2.read())!= -1) {
				out.write((char)data);
				System.out.print((char)data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}
}
