package com.huoli.BaseJFrame;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import com.huoli.baseInterface.baseInterface;

public abstract class BaseJFrame extends JFrame implements baseInterface {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4821091674049273593L;
	protected JLayeredPane lay;
	//0代表隐藏，1代表显示，2代表跳转状态
	protected int condition;
	
	public BaseJFrame() {
		this.setLocation(300,200);
		this.setSize(1200,800);
		this.setResizable(false);
	}
}
