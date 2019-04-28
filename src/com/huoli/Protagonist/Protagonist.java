package com.huoli.Protagonist;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;

import com.huoli.PersonUnit.PersonUnit;

@SuppressWarnings("serial")
public class Protagonist extends PersonUnit implements KeyListener{
	
	private ImageIcon image;
	private int x;
	private int y;
	
	public Protagonist() {
		image = new ImageIcon("./static/test.png");
		image.setImage(image.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		x= 350;
		y= 400;
		this.setLocation(x, y);
		this.setSize(100, 100);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(image.getImage(),0,0,null);	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char ch = e.getKeyChar();
		if(ch == 'w') {
			y-=20;
		}
		if(ch == 's') {
			y+=20;
		}
		if(ch == 'a') {
			x-=20;
		}
		if(ch == 'd') {
			x+=20;
		}
		this.setLocation(x, y);
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
