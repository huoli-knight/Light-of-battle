package com.huoli.FirstStage;

import java.awt.Point;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import com.huoli.BaseJFrame.BaseJFrame;

@SuppressWarnings("serial")
public class FirstStage extends BaseJFrame {

	private JButton button;
	private JButton exitbutton;
	private JPanel panelback;
	private ImageIcon imageback;
	private JLabel labelback;

	public FirstStage() {
		super();
		condition = 0;
		this.setTitle("Light Of Battle");
		imageback = new ImageIcon("./static/indexback.gif");
		labelback = new JLabel(imageback);
		button = new JButton("返回");
		exitbutton = new JButton("结束");
		lay = new JLayeredPane();
		panelback = new JPanel();
		this.setVisible(false);
	}

	@Override
	public void run() {
		setpanelback();
		setlabelback();
		panelback.add(labelback);
		panelback.add(button);
		button.addActionListener(this);
		panelback.add(exitbutton);
		exitbutton.addActionListener(this);
		this.setLayeredPane(lay);
		lay.add(panelback, JLayeredPane.DEFAULT_LAYER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void setlabelback() {
		labelback.setSize(800, 800);
	}
	
	private void setpanelback() {
		panelback.setSize(800, 800);
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
	public void setVisible(boolean vis) {
		if (vis) {
			condition = 1;
		}
		else {
			condition = 0;
		}
		super.setVisible(vis);
	}

	public int getCondition() {
		return this.condition;
	}
	
	public void resetCondition() {
		condition = 0;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String state = e.getActionCommand();
		if (state.equals("返回")) {
			condition = 2;
			this.setVisible(false);
		}
		if (state.equals("结束")) {
			System.exit(0);
		}
	}

}
