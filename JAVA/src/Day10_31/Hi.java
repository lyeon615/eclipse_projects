package Day10_31;

public class Hi {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		hiEveryone(12);
		hiEveryone(13);
		System.out.println("���α׷� ��");
		System.out.println();

		double myHeight = 166.6;
		hiEveryone(26, 179.8);
		hiEveryone(26, myHeight);
		byeEveryone();
	}
	public static void hiEveryone(int age) {
		System.out.println("���� ��ħ~");
		System.out.println("���� "+ age + "��!");
	}
	
	public static void hiEveryone(int age, double height) {
		System.out.println("���� "+ age + "��!");
		System.out.println("�׸��� "+ height + "cm!");
	
	}
	public static void byeEveryone() {
		System.out.println("�߰�~");

	}
		
}
