package com.huoli.IndividualModel.BloodStrip;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

public class BloodStrip extends JLabel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1262452333758219094L;
	private int bloodvolume;
	
	public BloodStrip(int blood) {
		bloodvolume = blood;
		this.setSize(bloodvolume, 4);
		this.setLayout(null);
		this.setBackground(null);
		this.setOpaque(false);
		this.setVisible(true);
		
	}

	@Override
	public void setLocation(int x, int y) {
		super.setLocation(x, y);
	}
	
	@Override
	public void setSize(int x, int y) {
		super.setSize(x, y);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(0, 0, bloodvolume, 10);
	}

}
