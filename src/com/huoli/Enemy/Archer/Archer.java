package com.huoli.Enemy.Archer;

import java.awt.Point;

import javax.swing.ImageIcon;

import com.huoli.Collision.Collision;
import com.huoli.FirstMap.FirstMap;
import com.huoli.PersonUnit.PersonUnit;
import com.huoli.Protagonist.Protagonist;

public class Archer extends PersonUnit{

	/**
	 * ¹­¼ýÊÖ
	 */
	private static final long serialVersionUID = -561653779533730553L;
	public static boolean weap = false;

	public Archer(ImageIcon image, int x, int y) {
		super(image, x, y);
		// TODO Auto-generated constructor stub
		super.setLocation(300, 100);
		this.setBackground(null);
		super.setOpaque(false);
	}
	
	@Override
	public Point getLocation() {
		return super.getLocation();
	}

	@Override
	public void run() {
		for (; true;) {
			try {
				Thread.sleep(100);
				weap = false;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			Point p = this.getLocation();
			int x = p.x;
			int y = p.y;
			if (p.x - 5 < Protagonist.x && Protagonist.x < p.x + 5) {
				weap = true;
				continue;
			}
			if (Protagonist.x < p.x) {
				x -= 5;
			} else {
				x += 5;
			}

			Point rad = new Point(this.getWidth(), this.getHeight());
			if (Collision.mapTesting(FirstMap.collisionbool, p, rad)) {
				this.setLocation(x, y);
				p = this.getLocation();
				if (Collision.mapTesting(FirstMap.collisionbool, p, rad) == false) {
					this.setLocation(p);
				}
			}
		}

	}

	@Override
	public void bloodStrip() {
		// TODO Auto-generated method stub
		
	}

}
