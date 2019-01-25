package control;

import java.util.Random;

public class world extends Thread {
	public int nRow;
	public int nColumn;
	private double[][] Cells; 
	private double cellsGrowSpeed=0.1;
	public static int TIME_STEP=1000;
	public world(int x, int y ) {
		nRow = x;
		nColumn = y;
		Random ran = new Random() ;
		Cells = new double[x][y]; 
		for (int j=0; j<y; j++) {
			for(int i=0; i<x; i++) {
			Cells[i][j] = ran.nextDouble();
		}
		}
	}
	public double getCells(int i, int j) {
		return Cells[i][j];
	}
	public void run() {
		Random ran = new Random();
		while(true) {
			for(int i=0; i<nRow; i++) {
				for (int j=0; j<nColumn; j++) {
					double x = ran.nextDouble();
					Cells[i][j] = Cells[i][j]+ x * cellsGrowSpeed;
					if (Cells[i][j]>1) {
						Cells[i][j] = 1 ;
					}
				}
			}
			
		try {
			Thread.sleep(world.TIME_STEP);
			}
		
				catch(Exception e) {
					e.printStackTrace();		}
		}
	}
		
	}
	

