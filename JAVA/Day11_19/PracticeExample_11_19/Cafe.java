package PracticeExample_11_19;

import java.util.HashMap;
import java.util.Scanner;

public class Cafe {
	public static void main(String[] args) {
		HashMap<String, Integer> cafe = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		cafe.put("에스프레소", 2000);
		cafe.put("아메리카노", 2500);
		cafe.put("카푸치노", 3000);		
		cafe.put("카페라테", 3500);

		String menu = "";
		
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼가 있습니다.");
		while (true) {
			System.out.print("주문>> ");
			menu = sc.next();

			if (menu.equals("stop"))
				break;
			
			if(cafe.get(menu) != null)
				System.out.println(menu+"는 "+cafe.get(menu)+"입니다.");
			else
				System.out.println(menu+"(이)라는 메뉴는 없습니다.");
		}
		System.out.println("주문이 완료되었습니다.");
		sc.close();
	}
}
