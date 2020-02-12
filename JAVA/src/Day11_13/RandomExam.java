package Day11_13;

import java.util.Random;

public class RandomExam {
	public static void main(String[] args) {
		Random rand = new Random(); // 실행할 때마다 다른 결과를 보여준다.
		// Random rand = new Random(12); //실행할 때마다 같은 결과를 보여준다.
		for (int i = 0; i < 7; i++)
			System.out.println(rand.nextInt(1000));
	}
}
