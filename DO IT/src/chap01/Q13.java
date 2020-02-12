package chap01;
//µ¡¼ÀÇ¥
public class Q13 {
	public static void main(String[] args) {
		
		System.out.print("   |");
		for(int j = 1 ; j <= 9 ; j++) {
			System.out.printf("%3d", j);

		}
		System.out.println("\n---+---------------------------");

		for(int i = 1; i <= 9; i++) {
			System.out.printf("%3d|", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i+j);
			}
			System.out.println();
		}
	}
}
