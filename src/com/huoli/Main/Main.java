package com.huoli.Main;

import com.huoli.FirstStage.FirstStage;
import com.huoli.Index.Index;

public class Main {

	public static void main(String[] args) {
		Index index = new Index();
		index.run();
		index.setVisible(true);
		FirstStage firststage = new FirstStage();
		firststage.run();
		while (true) {
			if (index.getVisible()) {
				firststage.setVisible(false);
			} else {
				firststage.setVisible(true);

				if (firststage.getVisible() == false) {
					index.setVisible(true);
				}
			}
		}
	}

}
