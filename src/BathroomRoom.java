/**
 * Created with IntelliJ IDEA.
 * User: Bertie
 * Date: 29/03/13
 * Time: 00:16
 * To change this template use File | Settings | File Templates.
 */
public class BathroomRoom extends Room {
	public BathroomRoom() {
		super("You're in the bathroom");
		setItems(new Item[] {
			new Item("mop"),
			new Item("big ass machete"),
			new Item("broken tile")
		});
	}
}
