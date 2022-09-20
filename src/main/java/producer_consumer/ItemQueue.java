package producer_consumer;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author: rensiyu
 * @createTime: 2022/06/15
 * @description:
 */
public class ItemQueue {
	
	public final BlockingQueue<Item> queue;
	
	public ItemQueue() {
		queue = new LinkedBlockingQueue<>(5);
	}
	
	public void put(Item item) throws InterruptedException {
		queue.put(item);
	}
	
	public Item take() throws InterruptedException {
		return queue.take();
	}
}
