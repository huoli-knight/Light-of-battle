package com.huoli.FirstStage;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import com.huoli.BaseJFrame.BaseJFrame;

@SuppressWarnings("serial")
public class FirstStage extends BaseJFrame {

	private JButton button;
	private JButton exitbutton;
	private boolean visible;
	private JPanel panelback;

	public FirstStage() {
		super();
		visible = false;
		this.setTitle("Light Of Battle");
		button = new JButton("返回");
		exitbutton = new JButton("结束");
		lay = new JLayeredPane();
		panelback = new JPanel();
		this.setVisible(false);
	}

	public void run() {
		panelback.setSize(800, 800);
		panelback.add(button);
		button.addActionListener(this);
		panelback.add(exitbutton);
		exitbutton.addActionListener(this);
		this.setLayeredPane(lay);
		lay.add(panelback, JLayeredPane.DEFAULT_LAYER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void setVisible(boolean vis) {
		visible = vis;
		super.setVisible(vis);
	}

	public boolean getVisible() {
		return this.visible;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String state = e.getActionCommand();
		if (state.equals("返回")) {
			this.setVisible(false);
		}
		if (state.equals("结束")) {
			System.exit(0);
		}
	}

}
