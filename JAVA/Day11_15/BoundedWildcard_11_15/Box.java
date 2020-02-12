package BoundedWildcard_11_15;

public class Box <T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get(){
		return ob;
	}
}
