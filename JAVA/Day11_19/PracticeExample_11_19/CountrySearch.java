package PracticeExample_11_19;

import java.util.HashMap;
import java.util.Scanner;

public class CountrySearch {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();

		String country = "";
		Integer population = 0;

		System.out.println("���� �̸��� �α��� �Է��Ͻÿ� ex)Korea 5000");

		while (true) {
			System.out.print("���� �̸�, �α�>> ");
			country = sc.next();
			if (country.equals("stop"))
				break;
			population = sc.nextInt();
			map.put(country, population);
		}
		while (true) {
			System.out.print("�α� �˻�>> ");
			country = sc.next();
			
			if (country.equals("stop"))
				break;
			
			if(map.get(country) != null)
				System.out.println(country+"�� �α��� "+map.get(country));
			else
				System.out.println(country+"(��)��� ����� �����ϴ�.");
				
		}
	}
}
