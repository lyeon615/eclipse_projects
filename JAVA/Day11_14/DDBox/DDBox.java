package DDBox;

public class DDBox<T, U> {
	private T t;
	private U u;

	void set(T t, U u) {
		this.t = t;
		this.u = u;

	}
	@Override
	public String toString() {
		return t + "\n" + u;
	}
}
