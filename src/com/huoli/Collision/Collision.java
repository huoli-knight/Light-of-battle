package com.huoli.Collision;

import java.awt.Point;

public class Collision {

	public static boolean rectangleTesting(Point p1, int rad1, Point p2, Point rad2) {
		if (p1.x > p2.x + rad2.x) {
			return true;
		}
		if (p1.y + rad1 < p2.y) {
			return true;
		}
		if (p1.x + rad1 < p2.x) {
			return true;
		}
		if (p1.y > p2.y + rad2.y) {
			return true;
		}
		return false;
	}

}
