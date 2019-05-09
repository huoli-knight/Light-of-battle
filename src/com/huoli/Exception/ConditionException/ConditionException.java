package com.huoli.Exception.ConditionException;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class ConditionException extends Exception {

	public String toString() {
		return "程序发生错误！选择\"是\"返回菜单,选择\"否\"结束程序。";
	}

	public boolean dialogResult() {
		int res = JOptionPane.showConfirmDialog(null, toString(), "显示错误处理", JOptionPane.YES_NO_OPTION);
		if (res == JOptionPane.YES_OPTION) {
			return true;
		} else {
			return false;
		}
	}

}
