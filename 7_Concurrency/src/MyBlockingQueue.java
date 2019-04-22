import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

public class MyBlockingQueue {
	
	public void addAndPrintItems(BlockingDeque<Integer> deque) {
		deque.offer(103);
		deque.offerFirst(20, 1, TimeUnit.SECONDS);
		deque.offerLast(85, 7, TimeUnit.HOURS);
		System.out.print(deque.pollFirst(200, TimeUnit.NANOSECONDS));
		System.out.print(" "+deque.pollLast(1, TimeUnit.MINUTES));
	}
	
	public static void main(String... args) {
		
	}

}
