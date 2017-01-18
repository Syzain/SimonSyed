public class MoveEduardo implements MoveInterfaceSyed {

	private ButtonInterface b; 
	
	public Move(ButtonInterface b) {
		this.b = b;
	}

	public ButtonInterface getButton() {
		return b;
	}

}
