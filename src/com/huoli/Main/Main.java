package com.huoli.Main;

import java.awt.Point;

import com.huoli.Exception.ConditionException.ConditionException;
import com.huoli.FirstStage.FirstStage;
import com.huoli.Index.Index;

public class Main {

	public static void main(String[] args) {
		Point p = new Point(500, 200);
		Index index = new Index();
		index.run();
		index.setVisible(true);
		FirstStage firststage = new FirstStage();
		firststage.run();
		firststage.setVisible(false);
		while (true) {
			try {
				judgeCondition(index.getCondition());
			} catch (ConditionException e) {
				boolean dealwith = e.dialogResult();
				if (dealwith) {
					index.setVisible(true);
					firststage.setVisible(false);
				}
				else {
					System.exit(0);
				}
			}
			try {
				judgeCondition(firststage.getCondition());
			} catch (ConditionException e) {
				boolean dealwith = e.dialogResult();
				if (dealwith) {
					index.setVisible(true);
					firststage.setVisible(false);
				}
				else {
					System.exit(0);
				}
			}
			if (index.getCondition() == 1) {
				firststage.setVisible(false);
			}
			if (firststage.getCondition() == 1) {
				index.setVisible(false);
			}
			if (index.getCondition() == 2) {
				index.resetCondition();
				p = index.getLocation();
				firststage.setLocation(p);
				firststage.setVisible(true);
			}
			if (firststage.getCondition() == 2) {
				firststage.resetCondition();
				p = firststage.getLocation();
				index.setLocation(p);
				index.setVisible(true);
			}
		}
	}

	// 判断condition的值是否符合范围
	private static void judgeCondition(int condition) throws ConditionException {
		for (int i = 0; i < 3; i++) {
			if (i == condition) {
				return;
			}
		}
		throw new ConditionException();
	}

}
