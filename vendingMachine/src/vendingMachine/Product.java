package vendingMachine;

public enum Product {

	TWIX(1,100),COKE(2,50),WTAER(3,30),SANDWITCH(4,150);
	
	private int id;
	private int price;
	
	Product(int id, int price){
		this.id=id;
		this.price=price;
	}

	public int getId() {
		return id;
	}

	public int getPrice() {
		return price;
	}

	
	
	
}
