package PracticeExample_11_22;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

class Exercise13_8 {

	Vector<String> words = new Vector<>();
	String[] data = { "�¿�", "����", "����", "ȿ��", "����", "����", "Ƽ�Ĵ�", "���", "����ī" };

	int interval = 2 * 1000; // 2��
	WordGenerator wg = new WordGenerator();

	public static void main(String args[]) {
		Exercise13_8 game = new Exercise13_8();
		game.wg.start();
		Vector<String> words = game.words;

		while (true) {
			System.out.println(words);
			String prompt = ">>";
			System.out.print(prompt);
			// ȭ�����κ��� ���δ����� �Է¹޴´�.
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			String input = s.nextLine().trim();
			int index = words.indexOf(input);

			if (index != -1) {
				words.remove(index);
			}
		}
	}
	class WordGenerator extends Thread {
		public void run() {
			Random rand = new Random();
			while(true) {
				words.add(data[rand.nextInt(9)]);	
				try {
					sleep(interval);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
