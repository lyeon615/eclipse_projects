package ArrayList_11_15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		
		for (int i=0 ; i < list.size();i++)
			System.out.println(list.get(i) + '\t');
		System.out.println();
		
		list.remove(0);
		
		for (int i=0 ; i < list.size();i++)
			System.out.println(list.get(i) + '\t');
		System.out.println();
		
	}
}
