package com.huoli.Exception.ConditionException;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class ConditionException extends Exception {

	public String toString() {
		return "����������ѡ��\"��\"���ز˵�,ѡ��\"��\"��������";
	}

	public boolean dialogResult() {
		int res = JOptionPane.showConfirmDialog(null, toString(), "��ʾ������", JOptionPane.YES_NO_OPTION);
		if (res == JOptionPane.YES_OPTION) {
			return true;
		} else {
			return false;
		}
	}

}
