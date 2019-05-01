package com.huoli.PersonUnit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.huoli.IndividualModel.IndividualModel;

public abstract class PersonUnit extends IndividualModel {
	
	/**
	 * 人物基本单位  有判断  行动不单一
	 */
	private static final long serialVersionUID = 8717548220025585030L;


	
	public PersonUnit(ImageIcon image, int x, int y) {
		super(image, x, y);
	}

	@Override
	public void bloodStrip() {
		// TODO Auto-generated method stub
		JLabel blood = new JLabel();
		
	}
}
