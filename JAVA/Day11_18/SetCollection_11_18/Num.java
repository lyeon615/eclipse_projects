package SetCollection_11_18;

public class Num {
	private int num;
	
	public Num(int n) {
		num = n;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}
	@Override
	public int hashCode() {
		return num;
	}
	@Override
	public boolean equals(Object obj) {
		if(num == ((Num)obj).num)
			return true;
		else
			return false;
	}
}
