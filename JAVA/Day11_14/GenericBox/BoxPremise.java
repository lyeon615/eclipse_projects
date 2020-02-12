package GenericBox;

public class BoxPremise<T extends Number> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
	
	public int toIntValue() {
		return ob.intValue();
	}
}
