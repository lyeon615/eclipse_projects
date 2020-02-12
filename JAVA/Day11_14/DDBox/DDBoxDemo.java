package DDBox;

public class DDBoxDemo {
	public static void main(String[] args) {
		DBox<String, Integer> box1 = new DBox<String, Integer>();
		box1.set("Apple", 25);
		
		DBox<String, Integer> box2 = new DBox<String, Integer>();
		box2.set("Orange", 33);
		
		DDBox<DBox<String, Integer>, DBox<String, Integer>> ddBox = new DDBox<DBox<String, Integer>, DBox<String, Integer>>();
		ddBox.set(box1, box2);
		
		System.out.println(ddBox);
		
	}
}
