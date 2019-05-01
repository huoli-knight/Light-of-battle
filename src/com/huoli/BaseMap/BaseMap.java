package com.huoli.BaseMap;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class BaseMap extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6976777922972531433L;
	protected final int width = 1400;
	protected final int height = 1000;
	protected final int maxrow = 20;
	protected final int maxcolumn = 28;
	protected ImageIcon[][] mapimage;
	protected JLabel[][] maplabel;
	public static boolean[][] collisionbool;
	
	public BaseMap() {
		maplabel = new JLabel[maxrow][maxcolumn];
		mapimage = new ImageIcon[maxrow][maxcolumn];
		collisionbool = new boolean[maxrow][maxcolumn];
		for (int y = 0; y < maxrow; y++) {
			for (int x = 0; x < maxcolumn; x++) {
				mapimage[y][x] = new ImageIcon();
				maplabel[y][x] = new JLabel();
				collisionbool[y][x] = true;
			}
		}	
	}


	protected void setLabel() {
		for (int y = 0; y < maxrow; y++) {
			for (int x = 0; x < maxcolumn; x++) {
				maplabel[y][x].setLayout(null);
				maplabel[y][x].setLocation(x*50, y*50);
				maplabel[y][x].setSize(50, 50);
				//TODO ±ß¿òÉèÖÃ
				//maplabel[i][y].setBorder(BorderFactory.createLineBorder(Color.green));
				this.add(maplabel[y][x]);
			}
		}
	}


	protected void setImage() {
		for (int y = 1; y < maxrow -1; y++) {
			for (int x = 1; x < maxcolumn -1; x++ ) {
				mapimage[y][x] = new ImageIcon("./static/map/topography/Ê¯Â·0.png");
			}
		}
		for (int y = 0; y < maxrow; y++) {
			mapimage[y][27] = new ImageIcon("./static/map/topography/Ê¯Ç½¿é0.png");
		}
		for (int y = 0; y < maxrow; y++) {
			mapimage[y][0] = new ImageIcon("./static/map/topography/Ê¯Ç½¿é0.png");
		}
		for (int x = 0; x < maxcolumn; x++) {
			mapimage[0][x] = new ImageIcon("./static/map/topography/Ê¯Ç½¿é0.png");
		}
		for (int x = 0; x < maxcolumn; x++) {
			mapimage[19][x] = new ImageIcon("./static/map/topography/Ê¯Ç½¿é0.png");
		}
	}
	

}
