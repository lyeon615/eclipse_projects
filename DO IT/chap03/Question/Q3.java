package Question;

import java.util.Scanner;

public class Q3 {
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		
		int i = 0, j = 0;
		for(i = 0 ; i < n ; i++) {
			if(a[i] == key) 
				idx[j++] = i;				
		}	
		
		return j;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟값: ");
		int n = sc.nextInt();
		int[] x = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색값: ");
		int key = sc.nextInt();
		int[] idx = new int[n];
		int idxLength = searchIdx(x, n, key, idx);
		
		int[] idx2 = new int[idxLength];

		for(int i = 0 ; i < idx2.length ; i++) {
			System.out.println("idx["+i+"]: "+idx[i]);
		}

		sc.close();
	}
}