package Day11_07;

public class SmartPhone extends MobilePhone {
	private String androidVer;

	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;

	}

	public void playApp() {
		System.out.println("App is runnung in " + androidVer);

	}
}
