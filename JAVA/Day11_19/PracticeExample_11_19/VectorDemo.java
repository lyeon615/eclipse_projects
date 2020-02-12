package PracticeExample_11_19;

import java.util.Scanner;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.print("강수량 입력(0입력시 종료) >> ");
			int water = sc.nextInt();
			
			if(water == 0)
				break;
			
			vector.add(water);
			
			int sum = 0;
			for(int i = 0 ; i < vector.size(); i++) {
				System.out.print(vector.elementAt(i)+ " ");
				sum += vector.elementAt(i);
			}
			System.out.println();
		
			System.out.println("현재 평균 " + sum/vector.size());
			System.out.println();
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}
