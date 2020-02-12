package Question;

import java.util.Scanner;

public class Chap04Q3Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Chap04Q3 s = new Chap04Q3(4);

		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + "/" + s.capacity());
			System.out.println("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)검색 (6)클리어 (7)풀 (8)엠프티? (9)2푸시 (10)2팝 (11)2피크 (12)2덤프 (13)2검색 (0)종료");

			int menu = sc.nextInt();
			if (menu == 0)
				break;

			int x;

			switch (menu) {
			case 1:
				System.out.print("데이터 : ");
				x = sc.nextInt();
				try {
					s.push(x);
				} catch (Chap04Q3.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			case 2:
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch (Chap04Q3.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;

			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (Chap04Q3.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;

			case 4:
				s.dump();
				break;

			case 5:
				System.out.print("검색값 : ");
				int search = sc.nextInt();
				int anwser = s.indexOf(search);
				if (anwser < 0)
					System.out.println("검색값이 없습니다.");
				else
					System.out.println("검색한 데이터는 바텀에서 " + (anwser+1) + "번쨰에 있습니다.");
				break;

			case 6:
				s.clear();
				break;

			case 7:
				if (s.isFull())
					System.out.println("스택이 가득 찼습니다.");
				else
					System.out.println("스택이 가득 차지 않았습니다.");
				break;

			case 8:
				if (s.isEmpty())
					System.out.println("스택이 비어있습니다.");
				else
					System.out.println("스택이 비어있지 않습니다.");
				break;
				
			case 9:
				System.out.print("데이터 : ");
				x = sc.nextInt();
				try {
					s.push2(x);
				} catch (Chap04Q3.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			case 10:
				try {
					x = s.pop2();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch (Chap04Q3.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 11:
				try {
					x = s.peek2();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (Chap04Q3.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;

			case 12:
				s.dump2();
				break;

			case 13:
				System.out.print("검색값 : ");
				search = sc.nextInt();
				anwser = s.indexOf2(search);
				if (anwser < 0)
					System.out.println("검색값이 없습니다.");
				else
					System.out.println("검색한 데이터는 바텀에서 " + (anwser+1) + "번쨰에 있습니다.");
				break;
				
			}
		}
		sc.close();
	}
}
