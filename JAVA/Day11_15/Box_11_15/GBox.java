package Box_11_15;

public class GBox<T> implements Getable<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	@Override
	public T get() {
		return ob;
	}
}
