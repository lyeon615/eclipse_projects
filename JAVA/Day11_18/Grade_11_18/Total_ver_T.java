package Grade_11_18;

import java.util.*;

public class Total_ver_T implements Totalable {	
	@Override
	public void printAVG() {
		ArrayList<Character> stack = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F) : ");

		for (int i = 0; i < 6; i++) {
			char c = sc.next().charAt(0);
			stack.add(c);
		}
		int sum = 0;

		for (int i = 0; i < stack.size(); i++) {
			char c = stack.get(i);
			switch (c) {
			case 'A':
				sum = sum + 4;
				break;
			case 'B':
				sum = sum + 3;
				break;
			case 'C':
				sum = sum + 2;
				break;
			case 'D':
				sum = sum + 1;
				break;
			case 'F':
				sum = sum + 0;
				break;
			}
		}
		double avr = (double) sum / stack.size();
		System.out.println(avr);
		
		sc.close();
	}
}
