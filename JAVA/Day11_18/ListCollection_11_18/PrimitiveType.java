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
			System.out.print(n + '\t'); // �̷��� �ϸ� �� 192939�� ���ñ�?
			//���ڶ� ���ڶ� ����� �� ���ڿ��� �ڵ�����ȯ�� �� �ȴ�. �׷��� �ƽ�Ű�ڵ�� ����ϰ� �Ǵµ�
			//\t�� �ƽ�Ű�ڵ尪�� 9���� ���� ���ڿ� 9�� ���� ���ڰ� ������ �ȴ�.
		}
		System.out.println();
	}
}
