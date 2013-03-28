public class KitchenRoom extends Room {
	public KitchenRoom() {
		super("You're in a kitchen.");
		setItems(new Item[] {
			new Item("knife")
		});
	}
}