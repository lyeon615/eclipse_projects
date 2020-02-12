package PracticeExample_11_21;

//import java.util.ArrayList;
//import java.util.List;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class LocationMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Location> info = new HashMap<String, Location>();

		String city = "";
		int lat = 0;
		int lon = 0;

		//List<Location> locationList = new ArrayList<>();

		System.out.println("�����̸�, ����, �浵�� �Է��ϼ���.");

		while (info.size() < 4) {
			System.out.print(">> ");
			String text = sc.nextLine();
			StringTokenizer st = new StringTokenizer(text, ", ");
			city = st.nextToken().trim();
			lat = Integer.parseInt(st.nextToken().trim());
			lon = Integer.parseInt(st.nextToken().trim());
			//locationList.add(new Location(city, lat, lon));
			info.put(city, new Location(city, lat, lon));
		}

//		System.out.println("----------------------------\n");
//		for (Location location : locationList)
//			System.out.println(location);

		System.out.println("----------------------------\n");

		Set<String> ks = info.keySet();
		for (String key : ks) {
			System.out.println(info.get(key).toString());
		}
		System.out.println();
		System.out.println("----------------------------");

		while (true) {

			System.out.print("���� �̸� >> ");
			city = sc.next();
			if (city.equals("�׸�"))
				break;

			if (info.get(city) != null)
				System.out.println(info.get(city));
			else
				System.out.println(city + " �� �����ϴ�.");
		}
		System.out.println("���α׷� �����մϴ�.");

		sc.close();
	}
}
