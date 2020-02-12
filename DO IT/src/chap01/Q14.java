package chap01;

import java.util.Scanner;

//입력한 수를 한 변으로 하는 정사각형을 *기호로 출력하는 프로그램을 작성하기
//사각형을 출력합니다
//단수 5
//*****
//*****
//*****
//*****
//*****
public class Q14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("사각형을 출력합니다");
		System.out.print("단수 : ");
		int side = sc.nextInt();

		String square = "";

		for (int i = 0; i < side; i++) {
			square += "* ";
		}
		for (int i = 0; i < side; i++) {
			System.out.println(square);
		}

		sc.close();
	}
}
