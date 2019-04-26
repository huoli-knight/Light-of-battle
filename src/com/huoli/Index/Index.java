package com.huoli.Index;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import com.huoli.BaseJFrame.BaseJFrame;
import com.huoli.Menu.Menu;

@SuppressWarnings("serial")
public class Index extends BaseJFrame {

	private ImageIcon imageback;
	private JPanel panelone;
	private JPanel panelback;
	private JLabel back;
	private JButton enterbutton;
	private JButton button;

	public Index() {
		this.setTitle("Index");
		lay = new JLayeredPane();
		panelone = new JPanel();
		panelback = new JPanel();
		imageback = new ImageIcon("./static/indexback.gif");
		back = new JLabel(imageback);
		enterbutton = new JButton("进入");
		button = new JButton("开始游戏");
	}

	public void run() {
		panelone.add(enterbutton);
		enterbutton.addActionListener(this);
		imageback.setImage(imageback.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT));
		panelback.setSize(800,800);
		back.setSize(800,800);
		panelback.add(back);
		button.setBackground(Color.yellow);
		panelone.add(button);
		button.addActionListener(this);
		lay.add(panelback,JLayeredPane.DEFAULT_LAYER);
		lay.add(panelone,JLayeredPane.MODAL_LAYER);
		this.setLayeredPane(lay);
		panelone.setSize(100, 100);
		panelone.setLocation(400,200);
		this.setLayeredPane(lay);
		this.setSize(800,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(500,200);
		this.setResizable(false);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String state = e.getActionCommand();
		if (state.equals("进入")) {
		}
		else {
			this.setVisible(false);
			Menu next = new Menu();
			next.run();
		}
	}

}
