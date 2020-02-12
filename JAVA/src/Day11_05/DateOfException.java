package Day11_05;

import java.time.LocalDate;

class DateOfException {
	static String date;
	static {
		LocalDate nDate = LocalDate.now();
		date = nDate.toString();
	}
	public static void main(String[] args) {
		System.out.println(date);
	}
}
