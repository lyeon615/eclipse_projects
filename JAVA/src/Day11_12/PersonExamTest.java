package Day11_12;

public class PersonExamTest {
	public static void main(String[] args) {
		PersonExam p1 = new PersonExam("ȫ�浿", "123456778");
		PersonExam p2 = new PersonExam("ȫ�浿", "123456778");

		System.out.println(p1.equals(p2));
		
	}
}

class PersonExam {
	String name;
	String no;

	PersonExam(String name, String no) {
		this.name = name;
		this.no = no;
	}
	@Override
	public boolean equals(Object obj){
		if (name == ((PersonExam) obj).name && no == ((PersonExam)obj).no)
			return true;
		else
			return false;
	}
	
	/*
	 * PersonExam per = new PersonExam();
	 * if (name.equals(per.name) && no.equals(per.no))
			return true;
		else
			return false;
	 * 
	 * 
	 * */
	
}
