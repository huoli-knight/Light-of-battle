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
	//0�������أ�1������ʾ��2������ת״̬
	protected int condition;
	protected final int width = 1400;
	protected final int height = 1000;
	
	public BaseJFrame() {
		this.setLocation(200,30);
		this.setSize(width, height);
		this.setResizable(false);
	}
}
