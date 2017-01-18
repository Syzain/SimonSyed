public class MoveEduardo implements MoveInterfaceSyed {

	private ButtonInterfaceSyed b; 
	
	public Move(ButtonInterfaceSyed b) {
		this.b = b;
	}

	public ButtonInterfaceSyed getButton() {
		return b;
	}

}
