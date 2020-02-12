package ListCollection_11_18;
import java.util.Iterator;
import java.util.LinkedList;

public class PrimitiveType {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		int n;
		
		for(Iterator<Integer> itr = list.iterator(); itr.hasNext();) {
			n = itr.next();
			//System.out.print(n + "\t");
			System.out.print(n + '\t'); // 이렇게 하면 왜 192939가 나올까?
			//문자랑 숫자라서 계산할 때 문자열로 자동형변환이 안 된다. 그래서 아스키코드로 계싼하게 되는데
			//\t의 아스키코드값은 9여서 원래 숫자에 9를 더한 숫자가 나오게 된다.
		}
		System.out.println();
	}
}
