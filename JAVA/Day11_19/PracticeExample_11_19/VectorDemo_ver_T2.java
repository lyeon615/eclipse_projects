package PracticeExample_11_19;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class VectorDemo_ver_T2 {
	public static void main(String[] args) {
		//VectorDemo_ver_T �� LinkedList�θ� �ٲ� ����
		List<Integer> vector = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����) >> ");
			int num = sc.nextInt();
			
			if(num == 0)
				break;
		
			vector.add(num);
			
			int avg = 0;
			
			for(int i = 0 ; i<vector.size(); i++) {
				System.out.print(vector.get(i) + " ");
				avg = avg + vector.get(i);
			}
			System.out.println();
			
			avg = avg / vector.size();
			System.out.println("�������: " + avg);
			System.out.println();
			
		}
		System.out.println("���α׷� �����Դϴ�.");
		sc.close();
	}
}
