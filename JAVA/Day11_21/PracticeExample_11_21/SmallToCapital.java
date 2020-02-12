package PracticeExample_11_21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SmallToCapital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st1 = "hello"; // sc.nextLine();
		String st2 = "small to capital"; // sc.nextLine();
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("text2.txt"))) {
			bw.write(st1, 0, st1.length());
			bw.newLine(); 
			bw.write(st2, 0, st2.length());

		} catch (IOException e) {
			e.printStackTrace();
		}
		try (BufferedReader br = new BufferedReader(new FileReader("text2.txt"))) {

			String str;

			while (true) {
				str = br.readLine();
				if (str == null)
					break;

				System.out.println(str.toUpperCase());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
