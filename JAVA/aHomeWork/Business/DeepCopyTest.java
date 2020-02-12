package Business;

public class DeepCopyTest {
	public static void main(String[] args) {
		try {
			PersonalInfo org = new PersonalInfo("James", 22, "SimpleSound", "encoding");

			PersonalInfo cpy = org.clone();
			
			System.out.println(org.equals(cpy)); // �ּҰ� ��ī�� Ȯ�ο�
			
			org.setName("samanda"); //��ī�� Ȯ�ο�
			org.setAge(32);
							
			org.showPersonalInfo();
			cpy.showPersonalInfo();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}			
	}
}

