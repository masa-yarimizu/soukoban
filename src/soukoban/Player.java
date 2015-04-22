package soukoban;

import java.util.ArrayList;

public class Player extends MovableObject{
	
	public Player(int x, int y) {
		super(x, y);
	}
	
	public void setPosition(int x, int y) {
		this.setX(x);
		this.setY(y);
		
	}
	
	public ArrayList<Integer> getPosition(int x, int y) {
		ArrayList<Integer> pos = new ArrayList<Integer>();
		pos.set(0, x);
		pos.set(1, y);
		
		return pos;	
	}
	
}