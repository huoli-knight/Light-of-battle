package com.huoli.FirstMap;

import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.huoli.BaseMap.BaseMap;

public class FirstMap extends BaseMap {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6119468087939341719L;
	private ImageIcon[][] mapimage;
	private JLabel[][] maplabel;
	private boolean[][] collisionbool;

	public FirstMap() {
		super();
		maplabel = new JLabel[maxrow][maxcolumn];
		mapimage = new ImageIcon[maxrow][maxcolumn];
		collisionbool = new boolean[maxrow][maxcolumn];
		for (int y = 0; y < maxrow; y++) {
			for (int x = 0; x < maxcolumn; x++) {
				mapimage[y][x] = new ImageIcon();
				maplabel[y][x] = new JLabel();
				collisionbool[y][x] = true;
			}
			//Arrays.fill(collisionbool[y], true);
		}
		
		this.setLayout(null);
		this.charting();
		this.setBackground(null);
		this.setOpaque(false);
		this.setLocation(0, 0);
		this.setSize(width, height);
	}
	
	public boolean[][] getcollisionbool(){
		return this.collisionbool;
	}

	public void charting() {
		this.setLabel();
		this.setImage();

		for (int y = 0; y < maxrow; y++) {
			maplabel[y][27] = new JLabel(mapimage[y][27]);
			collisionbool[y][27] = false;
		}
		for (int y = 0; y < maxrow; y++) {
			maplabel[y][0] = new JLabel(mapimage[y][0]);
			collisionbool[y][0] = false;
		}
		for (int x = 0; x < maxcolumn; x++) {
			maplabel[0][x] = new JLabel(mapimage[0][x]);
			collisionbool[0][x] = false;
		}
		for (int x = 0; x < maxcolumn; x++) {
			maplabel[19][x] = new JLabel(mapimage[19][x]);
			collisionbool[19][x] = false;
		}
		this.setLabel();
	}

	private void setImage() {

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

	private void setLabel() {
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

}
