package Question;

import java.util.Scanner;


public class Chap04Q2Test<E> {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Chap04Q2<String> s = new Chap04Q2<String>(64);

		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + "/" + s.capacity());
			System.out.println("(1)푸시 (2)팝 (3)피크 (4)덤프 (0)종료");

			int menu = sc.nextInt();
			if (menu == 0)
				break;

			String x;

			switch (menu) {
			case 1:
				System.out.print("데이터 : ");
				x = sc.next();
				try {
					s.push(x);
				} catch (Chap04Q2.OverflowGStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			
			case 2:
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				}catch(Chap04Q2.EmptyGStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			
			case 3 :
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				}catch(Chap04Q2.EmptyGStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
				
			case 4 : 
				s.dump();
				break;
			}
		}

	}

}

