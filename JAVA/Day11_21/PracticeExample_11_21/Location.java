package PracticeExample_11_21;

public class Location {
	private String city;
	private int latitude; // ����
	private int longitude; // �浵
	
	public Location(String city, int latitude, int longitude) {
		this.city = city;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		return city + " " + latitude + " " + longitude;
	}
}
