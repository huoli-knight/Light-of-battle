package com.huoli.Menu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.huoli.Index.Index;

public class Menu implements ActionListener {
	
	private JFrame index;
	private JButton button;
	
	public Menu() {
		index = new JFrame("Second");
		button = new JButton("·µ»Ø");
		index.add(button);
		button.addActionListener(this);
	}

	public void run() {
		Color background = new Color(42);
		index.setBackground(background);
		index.setSize(200, 200);

		index.setLocation(500, 200);
		index.setVisible(true);
	}
	
	@Override
	public void actionPerformed (ActionEvent e) {
		index.setVisible(false);
		Index next = new Index();
		next.run();
	}
	
}
