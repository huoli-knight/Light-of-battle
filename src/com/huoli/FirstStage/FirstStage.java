package com.huoli.FirstStage;

import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import com.huoli.BaseJFrame.BaseJFrame;
import com.huoli.Protagonist.Protagonist;

@SuppressWarnings("serial")
public class FirstStage extends BaseJFrame{

	private JPanel panelback;
	private JPanel test;
	private ImageIcon imageback;
	private JLabel labelback;
	private Protagonist protagonist;
	private JButton te;

	public FirstStage() {
		super();
		condition = 0;
		this.setTitle("Light Of Battle");
		imageback = new ImageIcon("./static/gameback.gif");
		labelback = new JLabel(imageback);
		lay = new JLayeredPane();
		panelback = new JPanel();
		
		te = new JButton("11");
		te.addActionListener(this);
		test = new JPanel();
		test.add(te);
		test.setSize(400, 400);
		test.setLocation(50, 50);
		protagonist =new Protagonist();
		this.setFocusable(true);
		this.addKeyListener(protagonist);
		this.setVisible(false);
	}

	@Override
	public void run() {
		setimageback();
		setpanelback();
		setlabelback();
		panelback.add(labelback);
		this.setLayeredPane(lay);
		lay.add(panelback, JLayeredPane.DEFAULT_LAYER);
		lay.add(test, JLayeredPane.PALETTE_LAYER);
		lay.add(protagonist, JLayeredPane.POPUP_LAYER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setimageback() {
		imageback.setImage(imageback.getImage().getScaledInstance(4000, 4000, Image.SCALE_DEFAULT));
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
		if (state.equals("11")) {
			condition = 2;
			this.setVisible(false);
		}
	}
}
