package PracticeExample_11_21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileMerge_ver_T {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try (BufferedReader f1 = new BufferedReader(new FileReader(sc.nextLine()));
				BufferedReader f2 = new BufferedReader(new FileReader(sc.nextLine()));
				BufferedWriter f3 = new BufferedWriter(new FileWriter(sc.nextLine()))) {

			int data;
			while ((data = f1.read()) != -1) {
				f3.write(data);

			}
			f3.newLine();
			while ((data = f2.read()) != -1) {
				f3.write(data);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}
}
