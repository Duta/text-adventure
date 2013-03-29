public class Room {
	private String description;
	private Room north;
	private Room east;
	private Room south;
	private Room west;
	private Inventory inventory;

	public Room(String description) {
		setDescription(description);
		inventory = new Inventory();
	}

	public void printDescription() {
		System.out.println(getDescription());
	}

	public void printDirections() {
		if(canGoNorth()) {
			System.out.println("You can go north.");
		}
		if(canGoEast()) {
			System.out.println("You can go east.");
		}
		if(canGoSouth()) {
			System.out.println("You can go south.");
		}
		if(canGoWest()) {
			System.out.println("You can go west.");
		}
	}

	public void printItems() {
		inventory.printItems("You see a %s.\n");
	}

	public boolean canGoNorth() {
		return north != null;
	}

	public boolean canGoEast() {
		return east != null;
	}

	public boolean canGoSouth() {
		return south != null;
	}

	public boolean canGoWest() {
		return west != null;
	}

	public boolean containsItem(String itemName) {
		return inventory.contains(itemName);
	}

	public Item removeItem(String itemName) {
		return inventory.remove(itemName);
	}

	public boolean parseSpecialInput(String[] words, Inventory inventory) {
		return false;
	}

	public void setDescription(String description) {
		this.description = description == null ? "" : description;
	}

	public void setNorth(Room north) {
		this.north = north;
	}

	public void setEast(Room east) {
		this.east = east;
	}

	public void setSouth(Room south) {
		this.south = south;
	}

	public void setWest(Room west) {
		this.west = west;
	}

	public void setItems(Item[] items) {
		inventory.setItems(items);
	}

	public String getDescription() {
		return description;
	}

	public Room getNorth() {
		return north;
	}

	public Room getEast() {
		return east;
	}

	public Room getSouth() {
		return south;
	}

	public Room getWest() {
		return west;
	}

	public Item[] getItems() {
		return inventory.getItems();
	}
}