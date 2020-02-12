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

		System.out.println("나라 이름과 인구를 입력하시오 ex)Korea 5000");

		while (true) {
			System.out.print("나라 이름, 인구>> ");
			country = sc.next();
			if (country.equals("stop"))
				break;
			population = sc.nextInt();
			map.put(country, population);
		}
		while (true) {
			System.out.print("인구 검색>> ");
			country = sc.next();
			
			if (country.equals("stop"))
				break;
			
			if(map.get(country) != null)
				System.out.println(country+"의 인구는 "+map.get(country));
			else
				System.out.println(country+"(이)라는 나라는 없습니다.");
				
		}
	}
}
