import java.awt.Color;
import java.awt.Graphics2D;

import guiPractice.components.Action;
import guiPractice.components.Components;

public class ButtonEduardo extends Components implements ButtonInterfaceSyed {

	private Action action;
	private Color color;
	private String name;
	
	public ButtonEduardo(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void act() {
		action.act();
	}

	@Override
	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public void highlight() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dim() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAction(Action action) {
		this.action = action;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(Graphics2D arg0) {
		// TODO Auto-generated method stub

	}

}
