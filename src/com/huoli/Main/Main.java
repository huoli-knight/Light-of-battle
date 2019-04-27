package com.huoli.Main;

import java.awt.Point;

import com.huoli.Exception.ConditionException.ConditionException;
import com.huoli.FirstStage.FirstStage;
import com.huoli.Index.Index;

public class Main {

	public static void main(String[] args) throws ConditionException {
		Point p = new Point(500, 200);
		Index index = new Index();
		index.run();
		index.setVisible(true);
		FirstStage firststage = new FirstStage();
		firststage.setVisible(false);
		firststage.run();
		while (true) {
			try {
				if (!(judgeCondition(index.getCondition()) || judgeCondition(firststage.getCondition()))) {
					throw new ConditionException();
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
			} catch (ConditionException e) {

			}
		}
	}

	// 判断condition的值是否符合范围
	private static boolean judgeCondition(int condition) {
		boolean judge = true;
		return judge;
	}

}
