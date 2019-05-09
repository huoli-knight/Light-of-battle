package com.huoli.PersonUnit;

import javax.swing.ImageIcon;

import com.huoli.IndividualModel.IndividualModel;
import com.huoli.IndividualModel.BloodStrip.BloodStrip;

public abstract class PersonUnit extends IndividualModel {
	
	/**
	 * 人物基本单位  有判断  行动不单一
	 */
	private static final long serialVersionUID = 8717548220025585030L;
	protected BloodStrip blood;


	
	public PersonUnit(ImageIcon image, int x, int y) {
		super(image, x, y);
		//人物的默认血量为100
		blood = new BloodStrip(100);
	}

	@Override
	public void bloodStrip() {
	}
}
