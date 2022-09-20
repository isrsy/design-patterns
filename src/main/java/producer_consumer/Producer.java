package producer_consumer;

import java.security.SecureRandom;

/**
 * @author: rensiyu
 * @createTime: 2022/06/15
 * @description: 生产者
 */
public class Producer {
	
	private static final SecureRandom RANDOM = new SecureRandom();
	
	private final ItemQueue queue;
	
	private final String name;
	
	private int itemId;
	
	public Producer(String name, ItemQueue queue) {
		this.name = name;
		this.queue = queue;
	}
	
	public void produce() throws InterruptedException {
		Item item = new Item(name, itemId++);
		queue.put(item);
		Thread.sleep(RANDOM.nextInt(2000));
	}
	
}
