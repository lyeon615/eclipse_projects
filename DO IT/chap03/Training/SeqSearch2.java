package Training;

import java.util.Scanner;

public class SeqSearch2 {
	
	static int seqSearch(int[] a, int num, int key) {
		for(int i = 0 ; i< num ; i++)
			if(a[i] == key)
				return i;
		return -1;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i = 0 ; i < num ; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		System.out.print("검색값 : ");
		int key = sc.nextInt();
		
		int idx = seqSearch(x, num, key);
		
		if (idx == -1)
			System.out.println("그 값의 요소는 없습니다.");
		else
			System.out.println(key + "는 x[" + idx + "]에 있습니다.");

		sc.close();
	}
}
