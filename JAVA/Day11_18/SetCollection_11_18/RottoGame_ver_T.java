package SetCollection_11_18;

import java.util.*;

public class RottoGame_ver_T {
	public static void main(String[] args) {
		Set<Integer> setLotto = new TreeSet<Integer>();
		while(setLotto.size() < 6) 
			setLotto.add((int)(Math.random()*45) + 1);
		System.out.println(setLotto);	
	}
}
