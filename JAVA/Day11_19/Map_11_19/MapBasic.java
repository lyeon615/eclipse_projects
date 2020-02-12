package Map_11_19;

import java.util.HashMap;

public class MapBasic {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		System.out.println("23번: " + map.get(23));
		System.out.println("37번: " + map.get(37));
		System.out.println("45번: " + map.get(45));
		System.out.println();
		
		map.remove(37);
		
		System.out.println("37번: " + map.get(37));
	}
}
