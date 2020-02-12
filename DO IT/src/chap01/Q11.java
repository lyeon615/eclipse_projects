package chap01;

import java.util.Scanner;

//양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
//예시 135 입력시 '그 수는 3자리입니다.' 출력 1314 입력시 '그 수는 4자리입니다.'라고 출력
public class Q11 {

	public static int number(int num) {

		int i = 0;

		while (true) {
			if (num < 0) {
				num = -num;
			}
			num /= 10;
			i++;
			if (num <= 0) {
				break;
			}
		}
		return i;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하시오");
		int num = sc.nextInt();

		System.out.println("그 수는" + number(num) + "자리수입니다.");
		sc.close();
	}
}
