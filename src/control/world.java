package control;

import java.util.Random;

public class world {
	public int nRow;
	public int nColumn;
	private double[][] Cells; 
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
	}

