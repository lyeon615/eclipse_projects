package PracticeExample_11_19;

public class Student  {
	private String name;
	private String subject;
	private String num;
	private String grades;
	
	Student(String name, String subject, String num, String grades){
		this.name = name;
		this.subject = subject;
		this.num = num;
		this.grades = grades;
	}
	@Override
	public String toString() {
		return "�̸�: " + name + "\n�а�: " + subject + "\n�й�: " + num + "\n����: "+grades;
	}

}
