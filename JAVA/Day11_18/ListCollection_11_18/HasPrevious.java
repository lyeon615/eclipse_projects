package ListCollection_11_18;

import java.util.*;

public class HasPrevious {
	public static void main(String[] args) {
		//asList로 만든 다음에 list = new ArrayList<>(list); 하면 어레이리스트로 바꿔줌
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);
			
		//양방향 반복자 획득
		ListIterator<String> litr = list.listIterator(); 
		
		String str;
		while(litr.hasNext()) { // 왼쪽에서 오른쪽으로 이동하기 위한 반복문 
			str = litr.next();
			System.out.print(str + '\t');
			if(str.equals("Toy"))
				litr.add("Toy2"); // Toy를 만나면 Toy2를 저장한다.
		}
		System.out.println();
		while(litr.hasPrevious()) { // 오른쪽에서 왼쪽으로 이동하기 위한 반복문 
			str = litr.previous();
			System.out.print(str + '\t');
			if(str.equals("Robot"))
				litr.add("Robot2"); // Robot을 만나면 Robot2를 저장한다.
		}
		System.out.println();
		while(litr.hasNext()) { // 왼쪽에서 오른쪽으로 이동하기 위한 반복문 
			str = litr.next();
			System.out.print(str + '\t');
			if(str.equals("Toy"))
				litr.add("Toy2"); // Toy를 만나면 Toy2를 저장한다.
		}
	}	
}
