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
		currentRow += ran.nextInt(2*speed+1) - speed;
		currentColumn += ran.nextInt(2*speed+1) - speed;
		currentRow = (currentRow >= world.nRow) ? (currentRow -= world.nRow)	: currentRow;
		currentColumn = (currentColumn>=world.nColumn) ? (currentColumn -= world.nColumn) : currentColumn;
		currentRow = (currentRow >0) ? (currentRow -= world.nRow)	: currentRow;
		currentColumn = (currentColumn>=0) ? (currentColumn -= world.nColumn) : currentColumn;
		
		return null;
	}
}
