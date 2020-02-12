package java_bank;

public class TV {
	String brand;
	int releaseYear;
	int size;

	TV(String brand, int releaseYear, int size) {
		this.brand = brand;
		this.releaseYear = releaseYear;
		this.size = size;
	}

	public void show() {
		System.out.println(brand + "에서 만든 " + releaseYear + "년 " + size + "인치 TV");
	}
}
