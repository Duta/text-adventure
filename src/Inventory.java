public class Inventory {
	private Item[] items;

	public Inventory() {
		items = new Item[0];
	}

	public void add(Item item) {
		// First check through the array
		// to see if there are any free
		// (null) slots
		for(int i = 0; i < items.length; i++) {
			if(items[i] == null) {
				items[i] = item;
				return;
			}
		}

		// Otherwise, expand the array by
		// 1 to accommodate the new item
		// (and add the new item)
		int len = items.length;
		Item[] newItems = new Item[len + 1];
		for(int i = 0; i < len; i++) {
			newItems[i] = items[i];
		}
		newItems[len] = item;
		items = newItems;
	}

	public void remove(Item item) {
		for(int i = 0; i < items.length; i++) {
			if(item == items[i]) {
				items[i] = null;
				return;
			}
		}
	}

	public Item remove(String itemName) {
		// If they passed null, exit
		if(itemName == null) {
			return null;
		}

		// For each item in the room
		for(int i = 0; i < items.length; i++) {
			Item item = items[i];
			// If it's null, don't bother checking and
			// move on to the next item in the array
			if(item == null) {
				continue;
			}
			// If it's the same name, remove it
			if(itemName.equalsIgnoreCase(item.getName())) {
				items[i] = null;
				return item;
			}
		}

		return null;
	}

	public boolean contains(Item item) {
		if(item == null) {
			return false;
		}
		for(int i = 0; i < items.length; i++) {
			if(item == items[i]) {
				return true;
			}
		}
		return false;
	}

	public boolean contains(String itemName) {
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

	public void printItems(String outputFormatString) {
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
			System.out.printf(outputFormatString, itemName);
		}
	}

	public boolean isEmpty() {
		for(int i = 0; i < items.length; i++) {
			if(items[i] != null) {
				return false;
			}
		}
		return true;
	}

	public void setItems(Item[] items) {
		this.items = items == null ? new Item[0] : items;
	}

	public Item[] getItems() {
		return items;
	}
}
