package SetCollection_11_18;

import java.util.TreeSet;

public class StringComparatorTest {
	public static void main(String[] args) {
		//TreeSet<String> tree = new TreeSet<>();
		TreeSet<String> tree = new TreeSet<>(new StringComparator());

		tree.add("Box");	
		tree.add("Rabbit");
		tree.add("Robot");
		tree.add("Bunny"); // ���� ���ڼ��� �ߺ����� ����?		
		
		for(String s : tree)
			System.out.print(s.toString() + '\t');
		System.out.println();
	}
}
