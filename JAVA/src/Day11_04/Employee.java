package Day11_04;

public class Employee {
	private String name;
	private int age;
	private String address;
	private String department;
	private int salary;

	public Employee(String name, int age, String address, String department, int salary) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.department = department;
		this.salary = salary;
	}

	public void printlnfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("�ּ�: " + address);
		System.out.println("�μ�: " + department);
		System.out.println("����: " + salary + "����");
	}
}
