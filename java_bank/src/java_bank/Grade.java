package java_bank;

import java.util.Scanner;

public class Grade {
	int math;
	int science;
	int english;
	
	public void right(int num) { //�̷��� �� �ȴ�..
		Scanner sc = new Scanner(System.in)				;
		while(true) {
			if(num >= 0 && num <= 100)
				break;
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			num = sc.nextInt();
			sc.close();
		}
	}

	Grade(int math, int science, int english) {
		right(math);
		right(science);
		right(english);
		
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public double average() {
		double avg = (math + science + english) / 3.0;

		return avg;
	}

}
