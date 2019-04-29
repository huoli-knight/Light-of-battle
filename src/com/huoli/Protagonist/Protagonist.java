package com.huoli.Protagonist;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;

import com.huoli.IndividualModel.IndividualModel;
import com.huoli.PersonUnit.PersonUnit;

public class Protagonist extends PersonUnit implements KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1140812889168316062L;
	private ImageIcon image;
	private int x;
	private int y;
	private char keychar;

	public Protagonist() {
		image = new ImageIcon("./static/test.png");
		image.setImage(image.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		x = 3600;
		y = 2400;
		individual = new IndividualModel(image);
		individual.setLocation(x, y);
		this.setLayout(null);
		this.add(individual);
		this.setBackground(null);
		this.setOpaque(false);
		this.setLocation(-3000, -2000);
		this.setSize(6000, 4000);
		keychar = '\0';
	}


	public void run() {
		if (keychar == 'w') {
			y -= 10;
		}
		if (keychar == 's') {
			y += 10;
		}
		if (keychar == 'a') {
			x -= 10;
		}
		if (keychar == 'd') {
			x += 10;
		}
		individual.setLocation(x, y);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		keychar = e.getKeyChar();
		this.run();
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}
