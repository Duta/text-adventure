public class Room {
	private String description;
	private Room north;
	private Room east;
	private Room south;
	private Room west;
	private Item[] items;

	public Room(String description) {
		setDescription(description);
		items = new Item[0];
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
		// For each item
		for(int i = 0; i < items.length; i++) {
			Item item = items[i];
			// If it's null, don't bother printing and
			// move onto the next item in the array
			if(item == null) {
				continue;
			}
			// Print the item
			String itemName = item.getName();
			System.out.println("You see a " + itemName + ".");
		}
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
		// If they passed null, don't bother checking
		if(itemName == null) {
			return false;
		}

		// For each item in the room
		for(int i = 0; i < items.length; i++) {
			Item item = items[i];
			// If it's null, don't bother checking and
			// move on to the next item in the array
			if(item == null) {
				continue;
			}
			// If it's the same name, return true
			if(itemName.equalsIgnoreCase(item.getName())) {
				return true;
			}
		}

		// If we couldn't find the item, return false
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
		this.items = items == null ? new Item[0] : items;
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
		return items;
	}
}