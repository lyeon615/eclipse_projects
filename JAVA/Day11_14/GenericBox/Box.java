package GenericBox;

public class Box <T>{
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
class Apple{
	public String toString() {
		return "I am an apple";
	}
}
class Orange{
	public String toString() {
		return "I am an orange";
	}
}