package com.huoli.FirstStage;

import java.awt.Image;
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
import com.huoli.Collision.Collision;
import com.huoli.FirstMap.FirstMap;
import com.huoli.Protagonist.Protagonist;

public class FirstStage extends BaseJFrame implements KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6572666754041875676L;
	private JPanel panelback;
	private ImageIcon imageback;
	private JLabel labelback;
	private Protagonist protagonist;
	private FirstMap map;
	private char keychar;

	public FirstStage() {
		super();
		condition = 0;
		this.setTitle("Light Of Battle");
		imageback = new ImageIcon("./static/gameback (1).gif");
		labelback = new JLabel(imageback);
		lay = new JLayeredPane();
		panelback = new JPanel();
		panelback.setLayout(null);
		protagonist = new Protagonist();
		map = new FirstMap();
		this.setFocusable(true);
		this.addKeyListener(this);
		this.setVisible(false);
		keychar = '\0';
	}

	@Override
	public void run() {
		setimageback();
		setpanelback();
		setlabelback();
		panelback.add(labelback);
		this.setLayeredPane(lay);
		lay.add(panelback, JLayeredPane.DEFAULT_LAYER);
		lay.add(map, JLayeredPane.PALETTE_LAYER);
		lay.add(protagonist, JLayeredPane.POPUP_LAYER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setimageback() {
		imageback.setImage(imageback.getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT));
	}

	private void setlabelback() {
		labelback.setSize(1200, 800);
	}

	private void setpanelback() {
		panelback.setSize(1200, 800);
		panelback.setLocation(0, 0);
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
		Point p1 = map.getLabelLocation();
		int rad1 = 150;
		Point p2 = protagonist.getIndividualLotcation();
		Point rad2 = new Point(34, 90);
		// Åö×²¼ì²â
		if (Collision.rectangleTesting(p1, rad1, p2, rad2)) {
			protagonist.run(keychar);

			p1 = map.getLabelLocation();
			p2 = protagonist.getIndividualLotcation();
			if (Collision.rectangleTesting(p1, rad1, p2, rad2) == false) {
				if (keychar == 'w') {
					keychar = 's';
				} else if (keychar == 's') {
					keychar = 'w';
				} else if (keychar == 'a') {
					keychar = 'd';
				} else if (keychar == 'd') {
					keychar = 'a';
				}
				protagonist.run(keychar);
			}
		}

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
