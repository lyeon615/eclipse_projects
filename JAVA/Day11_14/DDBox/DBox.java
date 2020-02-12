package DDBox;

public class DBox <T, U>{
	private T fruit;
	private U num;
	
	public void set(T fruit, U num) {
		this.fruit = fruit;
		this.num = num;
	}
	@Override
	public String toString() {
		return fruit + " & " + num;
	}

}
