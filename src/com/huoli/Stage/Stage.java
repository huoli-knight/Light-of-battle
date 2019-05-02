package com.huoli.Stage;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import com.huoli.BaseJFrame.BaseJFrame;
import com.huoli.FirstIndivdual.FirstIndivdual;
import com.huoli.FirstMap.FirstMap;

public class Stage extends BaseJFrame implements KeyListener {

	/**
	 * 关卡选择界面
	 */
	private static final long serialVersionUID = 6572666754041875676L;
	private FirstIndivdual firstindivdual;
	private FirstMap map;
	private char keychar;
	private JPanel panelback;
	private ImageIcon imageback;
	private JLabel labelback;

	public Stage() {
		super();
		condition = 0;
		panelback = new JPanel();
		imageback = new ImageIcon("./static/草地back.png");
		labelback = new JLabel(imageback);
		labelback.setLayout(null);
		labelback.setSize(width, height);
		panelback.add(labelback);
		panelback.setSize(width, height);
		panelback.setLayout(null);
		this.setTitle("Light Of Battle");
		lay = new JLayeredPane();
		map = new FirstMap();
		firstindivdual = new FirstIndivdual();

		Thread thread1 = new Thread(firstindivdual);
		thread1.start();
		
		this.setFocusable(true);
		this.addKeyListener(this);
		this.setVisible(false);
		keychar = '\0';
	}

	//@Override
	public void run1() {
		this.setLayeredPane(lay);
		lay.add(panelback, JLayeredPane.DEFAULT_LAYER);
		lay.add(map, JLayeredPane.PALETTE_LAYER);
		lay.add(firstindivdual, JLayeredPane.POPUP_LAYER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		} else {
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

	@Override
	public void keyTyped(KeyEvent e) {
		keychar = e.getKeyChar();
		if (keychar == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}
		
		firstindivdual.dealWithKeychar(keychar, FirstMap.collisionbool);

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
