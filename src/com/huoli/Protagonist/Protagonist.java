package com.huoli.Protagonist;

import java.awt.Point;

import javax.swing.ImageIcon;

import com.huoli.IndividualModel.IndividualModel;
import com.huoli.IndividualModel.BloodStrip.BloodStrip;
import com.huoli.PersonUnit.PersonUnit;

public class Protagonist extends PersonUnit implements Runnable{

	/**
	 * 主角
	 */
	private static final long serialVersionUID = 1140812889168316062L;
	
	//TODO 私有以后在修改
	public static int x;
	public static int y;
	public static Point p;
	protected IndividualModel archer;
	

	public Protagonist(ImageIcon image, int startx, int starty) {
		super(image, startx, starty);
		p = new Point(image.getIconWidth(),image.getIconHeight());
		x = 600;
		y = 400;
		super.setLocation(x, y);
		

		blood.setLocation(x, y - 5);
		this.setBackground(null);
		super.setOpaque(false);
	}
	

	public Point getIndividualLotcation() {
		return this.getLocation();
	}

	public void dealWithKeychar(char keychar) {
		if (keychar == 'w' || keychar == 'W') {
			y -= 5;
		}
		if (keychar == 's' || keychar == 'S') {
			y += 5;
		}
		if (keychar == 'a' ||keychar == 'A') {
			x -= 5;
		}
		if (keychar == 'd' || keychar == 'D') {
			x += 5;
		}
		this.run();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.setLocation(x, y);
		blood.setLocation(x, y - 5);
		
	}

	public BloodStrip getBlood() {
		return this.blood;
	}
	
	public void setBlood() {
		bloodStrip();
		blood.setLocation(x, y - 5);
	}

	@Override
	public void bloodStrip() {
		super.bloodStrip();
		
	}
}
