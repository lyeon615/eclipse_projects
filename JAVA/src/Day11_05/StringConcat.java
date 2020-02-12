package Day11_05;

class StringConcat {
	public static void main(String[] args) {
		String st1 = "Coffee";
		String st2 = "Bread";

		String st3 = st1.concat(st2);
		System.out.println(st3);

		String st4 = "Fresh".concat(st3);
		System.out.println(st4);

		String str = "abcdefg";
		System.out.println(str.substring(2));

		System.out.println(str.substring(2, 3));

		String str1 = "Lexicographically";
		String str2 = "lexicographically";
		int cmp;

		if (str1.equals(str2))
			System.out.println("�� ���ڿ��� �����ϴ�.");
		else
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");

		cmp = str1.compareTo(str2);
		if (cmp == 0)
			System.out.println("�� ���ڿ��� ��ġ�մϴ�");
		else if (cmp < 0)
			System.out.println("������ �տ� ��ġ�ϴ� ���� " + str1);
		else
			System.out.println("������ �տ� ��ġ�ϴ� ���� " + str1);

		if (str1.compareToIgnoreCase(str2) == 0)
			System.out.println("�� ���ڿ��� �����ϴ�.");
		else
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		
		
		StringBuilder stbuf = new StringBuilder("123");
		
		stbuf.append(45678);
		System.out.println(stbuf.toString());
		
		stbuf.delete(0, 2);
		System.out.println(stbuf.toString());
	
		stbuf.replace(0, 3, "AB");
		System.out.println(stbuf.toString());
		
		stbuf.reverse();
		System.out.println(stbuf.toString());
		
		String sub = stbuf.substring(2, 4);
		System.out.println(sub);
		
		
		
	}
	
}
