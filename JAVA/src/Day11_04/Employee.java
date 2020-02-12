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
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + address);
		System.out.println("부서: " + department);
		System.out.println("월급: " + salary + "만원");
	}
}
