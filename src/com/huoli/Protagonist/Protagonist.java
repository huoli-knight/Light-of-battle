package com.huoli.Protagonist;

import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;

import com.huoli.IndividualModel.IndividualModel;
import com.huoli.PersonUnit.PersonUnit;

public class Protagonist extends PersonUnit{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1140812889168316062L;
	private ImageIcon image;
	private int x;
	private int y;

	public Protagonist() {
		image = new ImageIcon("./static/¹ØÓð.png");
		image.setImage(image.getImage().getScaledInstance(34, 90, Image.SCALE_DEFAULT));
		x = 600;
		y = 400;
		individual = new IndividualModel(image,68/2,180/2);
		individual.setLocation(x, y);
		this.setLayout(null);
		this.add(individual);
		this.setBackground(null);
		this.setOpaque(false);
		this.setLocation(0, 0);
		this.setSize(1500, 1200);
	}

	public Point getIndividualLotcation() {
		return individual.getLocation();
	}

	public void run(char keychar) {
		if (keychar == 'w') {
			y -= 5;
		}
		if (keychar == 's') {
			y += 5;
		}
		if (keychar == 'a') {
			x -= 5;
		}
		if (keychar == 'd') {
			x += 5;
		}
		individual.setLocation(x, y);
	}
}
