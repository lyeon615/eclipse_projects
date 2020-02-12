package Business;

class PersonalInfo extends Business {
	private String name;
	private int age;

	public PersonalInfo(String name, int age, String company, String work) {
		super(company, work);
		this.name = name;
		this.age = age;
	}
	void showPersonalInfo(){
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		super.showBusinessInfo();
	}
	public PersonalInfo clone() throws CloneNotSupportedException {
		PersonalInfo copy = (PersonalInfo) super.clone();
		//copy.name = new String(name); //없으면 카피도 바뀌어야 되는 거 아니야? 
		return copy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
