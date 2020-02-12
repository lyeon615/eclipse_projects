package Business;

class Business implements Cloneable {
	private String company;
	private String work;

	public Business(String company, String work) {
		this.company = company;
		this.work = work;
	}

	public void showBusinessInfo() {
		System.out.println("ȸ��: " + company);
		System.out.println("����: " + work);
	}

	public Business clone() throws CloneNotSupportedException {
		Business copy = (Business) super.clone();
		//copy.company = new String(company);
		//copy.work = new String(work);
		return copy;
	}
}

