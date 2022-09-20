package producer_consumer;

import lombok.extern.slf4j.Slf4j;


/**
 * @author: rensiyu
 * @createTime: 2022/06/15
 * @description:
 */
@Slf4j
public class Consumer {
	
	private final ItemQueue queue;
	
	private final String name;
	
	public Consumer(String name, ItemQueue queue) {
		this.name = name;
		this.queue = queue;
	}
	
	/**
	 * Consume item from the queue.
	 */
	public void consume() throws InterruptedException {
		Item item = queue.take();
		log.info("C`onsumer [{}] consume item [{}] produced by [{}]", name,
				item.getId(), item.getProducer());
		
	}
}
