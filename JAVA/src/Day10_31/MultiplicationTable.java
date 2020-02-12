package Day10_31;

public class MultiplicationTable {
	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %-2d%2s", j, i, (i * j), " ");
			}
			System.out.println();

		}
		System.out.println();

		for (int i = 1; i <= 9; i++) {
			for (int j = 9; j >= 1; j--) {
				System.out.printf("%d X %d = %-2d%2s", j, i, (j * i), "");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j % 2 == 0) {
					System.out.printf("%d X %d = %-2d%2s", j, i, (j * i), "");
				}
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if ((i * j) % 2 == 1)
					System.out.printf("%d X %d = %-2d%2s", j, i, (j * i), "");
			}
			if (i % 2 == 1)
				continue;
			System.out.println();
		}
	}
}
