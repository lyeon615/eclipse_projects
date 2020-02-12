package Question;

public class Chap04Q2<E> {
	private int max;
	private int ptr;
	private E[] stk;

	
	@SuppressWarnings("serial")
	public static class EmptyGStackException extends RuntimeException {
		public EmptyGStackException() {
		}
	}
	//static이 없었는데 없으면 
	//The generic class GStack<E>.EmptyGStackException may not subclass java.lang.Throwable 
	//컴파일에러 발생..ㅜ
	
	@SuppressWarnings("serial")
	public static class OverflowGStackException extends RuntimeException {
		public OverflowGStackException() {
		}
	}

	@SuppressWarnings("unchecked")
	public Chap04Q2(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	public E push(E x) throws OverflowGStackException {
		if (ptr >= max)
			throw new OverflowGStackException();
		return stk[ptr++] = x;
	}

	public E pop() throws EmptyGStackException {
		if (ptr <= 0)
			throw new EmptyGStackException();
		return stk[--ptr];
	}

	public E peek() throws EmptyGStackException {
		if (ptr <= 0)
			throw new EmptyGStackException();
		return stk[ptr - 1];
	}

	public int indexOf(E x) {
		for (int i = ptr - 1; i >= 0; i--)
			if (stk[i].equals(x))
				return i;
		return -1;
	}

	public void clear() {
		ptr = 0;
	}

	public int capacity() {
		return max;
	}

	public int size() {
		return ptr;
	}

	public boolean isEmpty() {
		return ptr <= 0;
	}

	public boolean isFull() {
		return ptr >= max;
	}

	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}
