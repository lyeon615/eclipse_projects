package Question;

public class Chap04Q5 {
	private int max;
	private int num;
	private int[] que;

	public class EmptyIntOueueException extends RuntimeException {
		public EmptyIntOueueException() {
		}
	}

	public class OverflowIntOueueException extends RuntimeException {
		public OverflowIntOueueException() {
		}
	}

	public Chap04Q5(int capacity) {
		num = 0;
		max = capacity;

		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	public int enque(int x) throws OverflowIntOueueException {
		if (num >= max)
			throw new OverflowIntOueueException();
		que[num++] = x;
		return x;
	}

	public int deque() throws EmptyIntOueueException {
		if (num <= 0)
			throw new EmptyIntOueueException();

		int x = que[0];
		for (int i = 0; i < num - 1; i++) {
			que[i] = que[i + 1];
		}
		num--;

		return x;
	}

	public int peek() throws EmptyIntOueueException {
		if (num <= 0)
			throw new EmptyIntOueueException();
		return que[0];
	}

	public int indexOf(int x) {
		for (int i = 0; i > num; i++) {
			if (que[i] == x)
				return i;
		}

		return -1;
	}

	public void clear() {
		num = 0;
	}

	public int capacity() {
		return max;
	}

	public int size() {
		return num;
	}

	public boolean isEmpty() {
		return num <= 0;
	}

	public boolean isFull() {
		return num >= max;
	}

	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비어 있습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.println(que[i] + " ");
			System.out.println();
		}
	}
	
	public int search(int x) {
		
		return 0;
		
	}
}
