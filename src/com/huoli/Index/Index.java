package com.huoli.Index;

import java.awt.Color;
import java.awt.Dimension;
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

@SuppressWarnings("serial")
public class Index extends BaseJFrame {

	private ImageIcon imageback;
	private JPanel panelmenu;
	private JPanel panelback;
	private JLabel labelback;
	private JButton enterbutton;
	private JButton readbutton;
	private JButton exitbutton;
	private JButton presskeybutton;
	private JButton imformationbutton;
	private boolean visible;

	public Index() {
		super();
		visible = false;
		this.setTitle("Light Of Battle");
		lay = new JLayeredPane();
		panelmenu = new JPanel();
		panelback = new JPanel();
		imageback = new ImageIcon("./static/indexback.gif");
		labelback = new JLabel(imageback);
		enterbutton = new JButton("��ʼ��Ϸ");
		readbutton = new JButton("��ȡ�浵");
		presskeybutton = new JButton("��������");
		imformationbutton = new JButton("�����Ϣ");
		exitbutton = new JButton("�˳���Ϸ");
		this.setVisible(false);
	}

	@Override
	public void run() {
		addButton();
		setpanelback();
		setimageback();
		setlabelback();
		panelback.add(labelback);
		lay.add(panelback, JLayeredPane.DEFAULT_LAYER);
		lay.add(panelmenu, JLayeredPane.MODAL_LAYER);
		setpanelmenu();
		this.setLayeredPane(lay);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void setVisible(boolean vis) {
		visible = vis;
		super.setVisible(vis);
	}
	
	private void setimageback() {
		imageback.setImage(imageback.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT));
	}

	
	private void setlabelback() {
		labelback.setSize(800, 800);
	}

	private void setpanelmenu() {
		panelmenu.setSize(100, 200);
		panelmenu.setLocation(350, 200);
		panelmenu.setBackground(null);
		panelmenu.setOpaque(false);
	}

	private void setpanelback() {
		panelback.setSize(800, 800);
	}

	private void addButton() {
		enterbutton.setPreferredSize(new Dimension(100, 30));
		enterbutton.setBackground(Color.yellow);
		panelmenu.add(enterbutton);
		enterbutton.addActionListener(this);
		readbutton.setPreferredSize(new Dimension(100, 30));
		readbutton.setBackground(Color.yellow);
		panelmenu.add(readbutton);
		readbutton.addActionListener(this);
		presskeybutton.setBackground(Color.yellow);
		presskeybutton.setPreferredSize(new Dimension(100, 30));
		panelmenu.add(presskeybutton);
		presskeybutton.addActionListener(this);
		imformationbutton.setBackground(Color.yellow);
		imformationbutton.setPreferredSize(new Dimension(100, 30));
		panelmenu.add(imformationbutton);
		imformationbutton.addActionListener(this);
		exitbutton.setBackground(Color.yellow);
		exitbutton.setPreferredSize(new Dimension(100, 30));
		panelmenu.add(exitbutton);
		exitbutton.addActionListener(this);
	}
	
	public Point getLocation() {
		return super.getLocation();
	}
	
	public boolean getVisible() {
		return this.visible;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String state = e.getActionCommand();
		if (state.equals("��ʼ��Ϸ")) {
			this.setVisible(false);
		}
		if (state.equals("��ȡ�浵")) {

		}
		if (state.equals("��������")) {

		}
		if (state.equals("�����Ϣ")) {

		}
		if (state.equals("�˳���Ϸ")) {
			System.exit(0);
		}
	}

}
