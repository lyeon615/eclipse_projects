package Question;

import Training.IntStack.EmptyIntStackException;
import Training.IntStack.OverflowIntStackException;

public class Chap04Q3 {
	private int max;
	private int ptr;
	private int ptr2;

	private int[] stk;

	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
		}
	}

	public Chap04Q3(int capacity) {
		ptr = 0;
		max = capacity;
		
		ptr2 = capacity-1;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	public int push(int x) throws OverflowIntStackException {
		if (ptr >= max-(max-ptr2))
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	public int push2(int x) throws OverflowIntStackException {
		if (ptr2 <= 0+ptr)
			throw new OverflowIntStackException();
		return stk[ptr2--] = x;
	}

	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	public int pop2() throws EmptyIntStackException {
		if (ptr2 >= max)
			throw new EmptyIntStackException();
		return stk[++ptr2];
	}

	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}
	
	public int peek2() throws EmptyIntStackException {
		if (ptr2 >= max)
			throw new EmptyIntStackException();
		return stk[ptr2 + 1];
	}

	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--)
			if (stk[i] == x)
				return i;
		return -1;
	}
	
	public int indexOf2(int x) {
		for (int i = ptr2 - 1; i >= 0; i--)
			if (stk[i] == x)
				return i;
		return -1;
	}

	public void clear() {
		ptr = 0;
		ptr2 = max;
	}

	public int capacity() {
		return max;
	}

	public int size() {
		return ptr;
	}
	
	public int size2() {
		return max - ptr2;
	}

	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	public boolean isEmpty2() {
		return ptr2 >= max;
	}

	public boolean isFull() {
		return ptr >= max-(max-ptr2);
	}

	public boolean isFull2() {
		return ptr2 <= 0+ptr;
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
	public void dump2() {
		if (ptr2 >= max)
			System.out.println("스택이 비어 있습니다.");
		else {
			for (int i = max; i > ptr2; i--)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}
