package producer_consumer;

public class Item {
	
	private final String producer;
	
	private final int id;
	
	public Item(String producer, int id) {
		this.id = id;
		this.producer = producer;
	}
	
	public int getId() {
		
		return id;
	}
	
	public String getProducer() {
		
		return producer;
	}
	
}