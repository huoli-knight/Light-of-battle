package com.huoli.FirstMap;

import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.huoli.BaseMap.BaseMap;
import com.huoli.IndividualModel.IndividualModel;

public class FirstMap extends BaseMap{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6119468087939341719L;
	private JLabel label;
	private ImageIcon image;
	private int x;
	private int y;
	
	public FirstMap() {
		super();
		this.setLayout(null);
		x = 200;
		y = 200;
		image = new ImageIcon("./static/ʯͷ.png");
		image.setImage(image.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
		label = new IndividualModel(image, 150,150);
		label.setLocation(x, y);
		this.add(label);
		this.setBackground(null);
		this.setOpaque(false);
		this.setLocation(0, 0);
		this.setSize(1200, 800);
	}
	
	public Point getLabelLocation() {
		return label.getLocation();
	}

}
