package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(1000);
		pq.offer(200);
		pq.offer(34);
		pq.offer(71);
		pq.offer(0);
		
		System.out.println(pq);
		System.out.println(pq.peek());
		
		System.out.println(pq.poll());
		System.out.println(pq);
//		
		for (Integer integer : pq) {
			System.out.println(integer);
		}
		
		System.out.println(">>>>>>>>>>>>>>");
	
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		System.out.println("--------------");
		
		pq.remove();
		System.out.println(pq);
		
//		Array Deque
		
		ArrayDeque<String> ad = new ArrayDeque<>();

		ad.add("Tea");
		ad.addFirst("Coffe");
		ad.addLast("Cold coffe");
		ad.offer("milk");
		System.out.println(ad);
		
		
	}

}
