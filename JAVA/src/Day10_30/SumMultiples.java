package Day10_30;

public class SumMultiples {

	public static void main(String[] args) {

		int sum = 0;
		// 1.1부터 100까지의 숫자의 합은
		System.out.println("1부터 100까지의 숫자의 합은?");
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		// 2.1부터 100까지의 숫자 중 3의 배수는
		System.out.println("1부터 100까지의 숫자 중 3의 배수는?");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

		// 3.1부터 100까지의 숫자 중 홀수의 합은
		sum = 0;
		System.out.println("\n1부터 100까지의 숫자 중 홀수의 합은?");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);

		// 4.구구단 7단을 출력하시오
		System.out.println("구구단 7단을 출력하시오");

		int dan = 7;
		for (int i = 1; i <= 9; i++) {
			int j = i * dan;
			System.out.println(dan + " x " + i + " = " + j);
		}
	}
}