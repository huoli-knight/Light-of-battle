package com.huoli.Weapon;

import java.awt.Color;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

import com.huoli.FirstIndivdual.FirstIndivdual;
import com.huoli.FirstMap.FirstMap;
import com.huoli.Protagonist.Protagonist;
import com.huoli.Testing.Collision;

public class Weapon extends JLabel implements Runnable {

	/**
	 * ÔÝÊ±µÄ×Óµ¯
	 */
	private static final long serialVersionUID = -6674094113134598710L;
	public static boolean bo;

	public Weapon() {
		super();
		super.setSize(10, 10);
		super.setLayout(null);
		super.setOpaque(true);
		super.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		super.setBackground(Color.BLUE);
	}

	@Override
	public void setLocation(int x, int y) {
		super.setLocation(x, y);
	}

	@Override
	public Point getLocation() {
		return super.getLocation();
	}
	
	@Override
	public void setLocation(Point p) {
		super.setLocation(p);
	}
	
	@Override
	public void run() {

		super.setVisible(true);
		Point p = this.getLocation();
		Point rad = new Point(super.getWidth(), super.getHeight());
		int judge;
		if (p.y > Protagonist.y) {
			judge = 1;
		} else {
			judge = 3;
		}
		
		int x = p.x;
		int y = p.y;
		for (; true;) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			x = p.x;
			y = p.y;
			if (judge == 1) {
				p.y -= 10;
			} else {
				p.y += 10;
			}
			if (Collision.rectangleTesting(new Point(Protagonist.x,Protagonist.y), Protagonist.p, p, rad) == false) {
				FirstIndivdual.bloodpro -= 5;
				break;
			}
			if (Collision.mapTesting(FirstMap.collisionbool, p, rad) == false) {
				this.setLocation(x, y);
					break;
			}
			this.setLocation(p);
		}
		super.setVisible(false);
	}
}
