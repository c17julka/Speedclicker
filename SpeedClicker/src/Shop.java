
class Shop {
	// Base String and int for subclasses
	private String name;
	private int price;

	// Method for setting the item name
	public String setItemName(String name) {
		this.name = name;
		return name;
	}

	// Method for getting the item name
	public String getItemName() {
		return name;
	}

	// Method for setting the item price
	public int setPrice(int price) {
		this.price = price;
		return price;
	}

	// Method for setting the item price
	public int getPrice() {
		return price;
	}

}
