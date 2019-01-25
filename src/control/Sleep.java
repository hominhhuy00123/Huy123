package control;

import java.util.Random;

public class Sleep extends Animal {
	public Sleep(double energy, boolean iMale, int speed, world world, int row, int column) {
		this.energy = energy;
		this.iMale = iMale;
		this.speed = speed;
		this.world = world;
		this.currentRow = row;
		this.currentColumn = column;
		this.ran = new Random();
		this.iMale = ran.nextBoolean();
	}
	public Object eat(Object o) {
		int [] ii = {1,-1,1};
		
		return null;
	}
}
