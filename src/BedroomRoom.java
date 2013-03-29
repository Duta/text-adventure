public class BedroomRoom extends Room {
	public BedroomRoom() {
		super("You're in your bedroom.");
	}

	@Override
	public boolean parseSpecialInput(String[] words, Inventory inventory) {
		// Check if the superclass
		// can parse it
		if(super.parseSpecialInput(words, inventory)) {
			return true;
		}

		// Check for tidy room
		if("tidy room".equalsIgnoreCase(words[0] + " " + words[1])) {
			System.out.println("You tidy the bedroom.");
			return true;
		}

		// Return false to say that we
		// didn't understand the input
		return false;
	}
}