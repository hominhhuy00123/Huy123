package control;

import java.util.Random;

public class Animal extends Thread implements IAnimal {
	protected double energy;
	protected boolean iMale;
	protected int speed;
	protected world world;
	protected int currentRow;
	protected int currentColumn;
	protected Random ran = new Random();
	@Override
	public Object eat(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object move(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object die(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object mate(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

}
