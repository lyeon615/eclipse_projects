package PracticeExample_11_19;

public class Stduen_ver_T {

	private String name;
	private String dept;
	private String number;
	private double grade;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public Stduen_ver_T(String name, String dept, String number, double grade) {
		this.name = name;
		this.dept = dept;
		this.number = number;
		this.grade = grade;
	}
	
}
