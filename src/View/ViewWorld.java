package View;

import control.world;

public class ViewWorld {
	public static void main(String[] args) {
		world world1 = new world(5,7);
			for (int i=0; i<world1.nRow; i++ )
				for (int j=0; j<world1.nColumn; j++ ) {
					System.out.println(String.format("%2f", world1.getCells(i, j)));
	}
	}
}
