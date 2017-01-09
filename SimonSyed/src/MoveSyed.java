

public class MoveSyed implements MoveInterfaceSyed {

	private ButtonInterfaceSyed b; 
	
	public MoveSyed(ButtonInterfaceSyed b) {
		this.b = b;
	}

	public ButtonInterfaceSyed getButton() {
		return b;
	}
}