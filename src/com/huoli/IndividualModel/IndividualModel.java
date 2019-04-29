package com.huoli.IndividualModel;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class IndividualModel extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7709488188366780720L;

	public IndividualModel(ImageIcon image) {
		this.setLayout(null);
		this.setSize(50, 50);
		this.setIcon(image);
	}
	
	@Override
	public void setOpaque(boolean bool) {
		super.setOpaque(bool);
	}
	
	@Override
	public void setBackground(Color color) {
		super.setBackground(color);
	}

	@Override
	public void setSize(int x, int y) {
		super.setSize(x, y);
	}
	
	@Override
	public void setLocation(int x, int y) {
		super.setLocation(x, y);
	}
}
