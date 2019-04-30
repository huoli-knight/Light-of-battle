package com.huoli.Collision;

import java.awt.Point;

public class Collision {

	public static boolean mapTesting(boolean[][] collisiontest, Point p, Point rad) {
		for (int y = 0; rad.y - 50 * y >= 0; y++) {
			if (collisiontest[p.y / 50 + y][p.x / 50] == false) {
				return false;
			}
		}
		for (int x = 0; rad.x - 50 * x >= 0; x++) {
			if (collisiontest[p.y / 50][p.x / 50 + x] == false) {
				return false;
			}
		}
		for (int y = 0; rad.y - 50 * y >= 0; y++) {
			if (collisiontest[p.y / 50 + y][(p.x + rad.x) / 50] == false) {
				return false;
			}
		}
		for (int x = 0; rad.x - 50 * x >= 0; x++) {
			if (collisiontest[(p.y + rad.y) / 50][p.x / 50 + x] == false) {
				return false;
			}
		}

		return true;
	}

	public static boolean rectangleTesting(Point p1, Point rad1, Point p2, Point rad2) {
		if (p1.x > p2.x + rad2.x) {
			return true;
		}
		if (p1.y + rad1.y < p2.y) {
			return true;
		}
		if (p1.x + rad1.x < p2.x) {
			return true;
		}
		if (p1.y > p2.y + rad2.y) {
			return true;
		}
		return false;
	}

}
