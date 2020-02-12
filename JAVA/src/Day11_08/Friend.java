package Day11_08;

public class Friend {
	protected String name;
	protected String phone;

	public Friend(String na, String ph) {
		name = na;
		phone = ph;
	}

	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ : " + phone);
	}
}
class CompFriend extends Friend {
	private String department;
	
	public CompFriend(String na, String de, String ph) {
		super(na, ph);
		department = de;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("�μ� : " + department);
	}
}
class UnivFriend extends Friend{
	private String major;
	
	public UnivFriend(String na, String ma, String ph) {
		super(na, ph);
		major = ma;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("���� : " + major);
	}
}