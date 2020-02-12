package BoundedWildcard_11_15;

public class BoxContentsMover {
	public static void moveBox(Box<? super Toy> to, Box<? extends Toy> from) {
		to.set(from.get());
	}
}
