package Day10_30;

public class BreakContinue {
	public static void main(String[] args) {
		int num = 1;
		boolean search = false;

		while (num < 100) {
			if (((num % 5) == 0) && ((num % 7) == 0)) {
				search = true;
				break;
			}
			num++;
		}
		if (search)
			System.out.println("5와 7의 최소공배수 : " + num);
		else
			System.out.println("100 미만의 5와 7의 공배수를 찾지 못했습니다.");

		num = 0;
		int count = 0;
		System.out.println("100 미만의 5와 7의 공배수 ");
		while ((num++) < 100) {
			if (((num % 5) != 0) || ((num % 7) != 0)) {
				continue;
			}
			count++;
			System.out.println(num);
		}
		System.out.println("count: " + count);
	}
}
