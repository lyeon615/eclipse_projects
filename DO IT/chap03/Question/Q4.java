package Question;

import java.util.Scanner;

public class Q4 {
	static int binSearch(int[] a, int n, int key) {

		int pl = 0, pr = n - 1;

		System.out.print("   |");
		for (int i = 0; i < n; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println("\n---+----------------------");

		do {
			int pc = (pl + pr) / 2;
			System.out.print("   |");
			System.out.printf(String.format("%%%ds", pl * 3 + 1), "<-");
			System.out.printf(String.format("%%%ds", pc * 3+1 - (pl * 3)), "+");
			System.out.printf(String.format("%%%ds\n", pr * 3 - (pc * 3)+1), "->");

			System.out.printf("%3d|", pc);
			for (int i = 0; i < n; i++)
				System.out.printf("%3d", a[i]);
			System.out.println();

			if (a[pc] == key)
				return pc;
			else if (a[pc] < key)
				pl = pc + 1;
			else
				pr = pc - 1;
		} while (pl <= pr);

		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];

		System.out.println("오름차순으로 입력하세요");
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]);
		}

		System.out.print("검색값 : ");
		int key = sc.nextInt();

		int idx = binSearch(x, num, key);

		if (idx == -1)
			System.out.println("요솟값 없음");
		else
			System.out.println(key + "는 x[" + idx + "]에 있다.");

		sc.close();
	}
}