package com.huoli.PersonUnit;

import javax.swing.ImageIcon;

import com.huoli.IndividualModel.IndividualModel;
import com.huoli.IndividualModel.BloodStrip.BloodStrip;

public abstract class PersonUnit extends IndividualModel {
	
	/**
	 * ���������λ  ���ж�  �ж�����һ
	 */
	private static final long serialVersionUID = 8717548220025585030L;
	protected BloodStrip blood;


	
	public PersonUnit(ImageIcon image, int x, int y) {
		super(image, x, y);
		//�����Ĭ��Ѫ��Ϊ100
		blood = new BloodStrip(100);
	}

	@Override
	public void bloodStrip() {
	}
}
