package Queue_11_19;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeBasic {
	public static void main(String[] args) {
		
		// 양방향으로 작동하는 stack 이라고 생각할 수 있다. 
		Deque<String> deq = new ArrayDeque<>();
		
		deq.offerFirst("1.Box");
		deq.offerFirst("2.Toy");
		deq.offerFirst("3.Robot");
		
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		
	}
}
