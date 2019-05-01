package com.huoli.IndividualModel;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.huoli.ExpandInterface.IndividualInerface.IndividualInerface;

public abstract class IndividualModel extends JLabel  implements Runnable, IndividualInerface {

	/**
	  *可以移动的生命模型 
	 */
	private static final long serialVersionUID = -7709488188366780720L;

	public IndividualModel(ImageIcon image,int x,int y) {
		this.setLayout(null);
		this.setSize(x, y);
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
