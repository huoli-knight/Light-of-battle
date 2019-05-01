package com.huoli.FirstMap;


import javax.swing.JLabel;

import com.huoli.BaseMap.BaseMap;

public class FirstMap extends BaseMap {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6119468087939341719L;

	public FirstMap() {
		super();
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

		for (int y = 1; y < maxrow -1; y++) {
			for (int x = 1; x < maxcolumn -1; x++ ) {
				maplabel[y][x] = new JLabel(mapimage[y][x]);
			}
		}
		
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

	@Override
	protected void setImage() {
		super.setImage();
	}

}
