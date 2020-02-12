package ListCollection_11_18;

import java.util.*;

public class HasPrevious {
	public static void main(String[] args) {
		//asList�� ���� ������ list = new ArrayList<>(list); �ϸ� ��̸���Ʈ�� �ٲ���
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);
			
		//����� �ݺ��� ȹ��
		ListIterator<String> litr = list.listIterator(); 
		
		String str;
		while(litr.hasNext()) { // ���ʿ��� ���������� �̵��ϱ� ���� �ݺ��� 
			str = litr.next();
			System.out.print(str + '\t');
			if(str.equals("Toy"))
				litr.add("Toy2"); // Toy�� ������ Toy2�� �����Ѵ�.
		}
		System.out.println();
		while(litr.hasPrevious()) { // �����ʿ��� �������� �̵��ϱ� ���� �ݺ��� 
			str = litr.previous();
			System.out.print(str + '\t');
			if(str.equals("Robot"))
				litr.add("Robot2"); // Robot�� ������ Robot2�� �����Ѵ�.
		}
		System.out.println();
		while(litr.hasNext()) { // ���ʿ��� ���������� �̵��ϱ� ���� �ݺ��� 
			str = litr.next();
			System.out.print(str + '\t');
			if(str.equals("Toy"))
				litr.add("Toy2"); // Toy�� ������ Toy2�� �����Ѵ�.
		}
	}	
}
