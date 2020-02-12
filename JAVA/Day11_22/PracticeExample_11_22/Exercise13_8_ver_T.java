package PracticeExample_11_22;

import java.util.*;

public class Exercise13_8_ver_T {
//	Vector words = new Vector();
	static String[] data = { "태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카" };

	public static void main(String args[]) {
//		Exercise13_8 game = new Exercise13_8();
//		game.wg.start();
//		Vector words = game.words;

		WordGenerator wg = new WordGenerator();
		
		Vector words = wg.getWords();

		wg.setData(data);
		wg.start();
		
		while (true) {
			System.out.println(words);
			String prompt = ">>";
			System.out.print(prompt);
			// 화면으로부터 라인단위로 입력받는다.
			Scanner s = new Scanner(System.in);
			String input = s.nextLine().trim();
			int index = words.indexOf(input);

			if (index != -1) {
				words.remove(index);
			}
		}
	}
}

class WordGenerator extends Thread {
	int interval = 2 * 1000; // 2초
	static String[] data;
	
	Vector words = new Vector();

	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}

	public Vector getWords() {
		return words;
	}

	public void setWords(Vector words) {
		this.words = words;
	}

	public void run() {

		while(true) {
			int rand = (int)(Math.random()*data.length);
			words.add(data[rand]);
			try {
				sleep(interval);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}