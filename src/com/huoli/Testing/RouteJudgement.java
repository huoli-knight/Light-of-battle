package com.huoli.Testing;

import java.awt.Point;

public class RouteJudgement {

	/*
	 * 路径判断
	 */

	// 路径选择 不动-0 左-1 上-2 右-3 下-4
	public static int routeJudgement(boolean[][] map, Point oneself, Point rad1, Point target, Point rad2) {
		int[][] route = new int[20][28];
		for (int y = 0; y < 20; y++) {
			for(int x = 0; x < 28; x++) {
				if (map[y][x]) {
					route [y][x] = 0;
				}else {
					route [y][x] = -1;
				}
			}
		}
		oneself.x = (oneself.x +  rad1.x / 2) / 50;
		oneself.y = (oneself.y +  rad1.y / 2) / 50;
		target.x = (target.x +  rad2.x / 2) / 50;
		target.y = (target.y +  rad2.y / 2) / 50;
		
		
		
		return 0;
	}
}
