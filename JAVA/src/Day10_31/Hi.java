package Day10_31;

public class Hi {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		hiEveryone(12);
		hiEveryone(13);
		System.out.println("프로그램 끝");
		System.out.println();

		double myHeight = 166.6;
		hiEveryone(26, 179.8);
		hiEveryone(26, myHeight);
		byeEveryone();
	}
	public static void hiEveryone(int age) {
		System.out.println("좋은 아침~");
		System.out.println("나는 "+ age + "살!");
	}
	
	public static void hiEveryone(int age, double height) {
		System.out.println("나는 "+ age + "살!");
		System.out.println("그리고 "+ height + "cm!");
	
	}
	public static void byeEveryone() {
		System.out.println("잘가~");

	}
		
}
