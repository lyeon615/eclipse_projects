package PracticeExample_11_19;

import java.util.HashMap;
import java.util.Scanner;

public class Cafe {
	public static void main(String[] args) {
		HashMap<String, Integer> cafe = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		cafe.put("����������", 2000);
		cafe.put("�Ƹ޸�ī��", 2500);
		cafe.put("īǪġ��", 3000);		
		cafe.put("ī�����", 3500);

		String menu = "";
		
		System.out.println("����������, �Ƹ޸�ī��, īǪġ��, ī��󶼰� �ֽ��ϴ�.");
		while (true) {
			System.out.print("�ֹ�>> ");
			menu = sc.next();

			if (menu.equals("stop"))
				break;
			
			if(cafe.get(menu) != null)
				System.out.println(menu+"�� "+cafe.get(menu)+"�Դϴ�.");
			else
				System.out.println(menu+"(��)��� �޴��� �����ϴ�.");
		}
		System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�.");
		sc.close();
	}
}
