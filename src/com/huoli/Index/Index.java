package com.huoli.Index;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.huoli.Second.Second;

public class Index implements ActionListener {

	private JFrame index;
	private JButton button;

	public Index() {
		index = new JFrame("Index");
		button = new JButton("Ìø×ª");
		index.add(button);
		button.addActionListener(this);
	}

	public void run() {
		Color background = new Color(11);
		index.setBackground(background);
		index.setSize(200, 200);
		index.setVisible(true);
	}
	
	@Override
	public void actionPerformed (ActionEvent e) {
		index.setVisible(false);
		Second next = new Second();
		next.run();
	}

}
