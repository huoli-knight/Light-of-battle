package com.huoli.BaseJFrame;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import com.huoli.baseInterface.baseInterface;

@SuppressWarnings("serial")
public abstract class BaseJFrame extends JFrame implements baseInterface {
	
	protected JLayeredPane lay;
	//0代表隐藏，1代表显示，2代表跳转状态
	protected int condition;
	
	public BaseJFrame() {
		this.setLocation(500,200);
		this.setSize(800,800);
		this.setResizable(false);
	}
}
