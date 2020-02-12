package SetCollection_11_18;

import java.util.*;

public class RottoGame {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<Integer>();

		while (lotto.size() < 6)
			lotto.add(1 + (int)(Math.random()*45));

		for (Integer n : lotto)
			System.out.print(n.toString() + "\t");
	}
}