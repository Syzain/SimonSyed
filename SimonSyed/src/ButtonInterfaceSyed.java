

import java.awt.Color;

import guiPractice.components.Action;
import guiPractice.components.Clickable;

public interface ButtonInterfaceSyed extends Clickable{

	void setColor(Color color);

	void highlight();

	void dim();

	void setAction(Action action);

	void setName(String name);
}