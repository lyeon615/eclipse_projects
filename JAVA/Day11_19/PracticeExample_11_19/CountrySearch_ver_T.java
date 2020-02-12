package PracticeExample_11_19;

import java.util.HashMap;
import java.util.Scanner;

public class CountrySearch_ver_T {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<>();
		System.out.println("���� �̸��� �α��� �Է��ϼ���. (��: Korea 5000)");
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� �̸�, �α� >>");
			String nation = scanner.next();
			
			if(nation.equals("�׸�"))
				break;
			
			int population = scanner.nextInt();
			nations.put(nation, population);
		}
		while(true) {
			System.out.print("�α� �˻� >>");
			String nation = scanner.next();
			
			if(nation.equals("�׸�"))
				break;
			
			Integer n = nations.get(nation);
			if(n == null)
				System.out.println(nation + " ����� �����ϴ�.");
			else
				System.out.println(nation + "�� �α��� " + n);
		}
		
		System.out.println("���α׷� �����մϴ�.");
		scanner.close();
	}
}
