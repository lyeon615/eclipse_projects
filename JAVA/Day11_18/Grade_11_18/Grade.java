package Grade_11_18;

import java.util.*;

public class Grade implements Totalable {
	@Override
	public void printAVG() {
		Scanner sc = new Scanner(System.in);

		List<Character> grade = new ArrayList<>();
		char gr;
		for (int i = 0; i < 6; i++) {	
			gr = sc.next().charAt(0);
			grade.add(gr);
		}
		System.out.println(grade);
		
		List<Double> grade2 = new ArrayList<>();
		for (Character g : grade) {
			if (g == 'A')
				grade2.add(4.0);
			else if (g == 'B')
				grade2.add(3.0);
			else if (g == 'C')
				grade2.add(2.0);
			else if (g == 'D')
				grade2.add(1.0);
			else
				grade2.add(0.0);
		}
		System.out.println(grade2);
		
		double sum = 0;
		for(double num : grade2)
			sum += num;
		
		double avg = sum / grade.size();				
		System.out.printf("%.2f", avg);
		
		sc.close();
	}
}
