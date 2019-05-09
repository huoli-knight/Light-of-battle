package com.huoli.BaseJFrame;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public abstract class BaseJFrame extends JFrame implements ActionListener  {
	
	/**
	 *   JFrame 容器的基础
	 */
	private static final long serialVersionUID = 4821091674049273593L;
	protected JLayeredPane lay;
	//0代表隐藏，1代表显示，2代表跳转状态
	protected int condition;
	protected final int width = 1400;
	protected final int height = 1000;
	
	public BaseJFrame() {
		this.setLocation(200,30);
		this.setSize(width, height);
		this.setResizable(false);
	}
}
