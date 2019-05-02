package com.huoli.FirstIndivdual;

import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.huoli.Enemy.Archer.Archer;
import com.huoli.Protagonist.Protagonist;
import com.huoli.Testing.Collision;
import com.huoli.Weapon.Weapon;

public class FirstIndivdual extends JPanel implements Runnable {

	/**
	 * 第一关的生物层
	 */
	private static final long serialVersionUID = 2599443146255011330L;
	private Protagonist protagonist;
	private ImageIcon protagonistimage;
	private ImageIcon archerimage;
	private Archer archerone;
	public static int bloodpro = 100;

	public FirstIndivdual() {
		super();

		protagonistimage = new ImageIcon("./static/关羽.png");
		protagonistimage.setImage(protagonistimage.getImage().getScaledInstance(34, 90, Image.SCALE_DEFAULT));
		protagonist = new Protagonist(protagonistimage, 34, 90);

		Thread thread1 = new Thread(protagonist);
		thread1.start();

		archerimage = new ImageIcon("./static/女弓箭手50_下行1.png");
		archerone = new Archer(archerimage, archerimage.getIconWidth(), archerimage.getIconHeight());

		Thread thread2 = new Thread(archerone);
		thread2.start();

		this.add(protagonist);
		this.add(protagonist.getBlood());
		this.add(archerone);
		this.setLayout(null);
		this.setSize(1400, 1000);
		this.setBackground(null);
		this.setOpaque(false);
		this.setLocation(0, 0);

	}

	public void dealWithKeychar(char keychar, boolean[][] mapcollisiontest) {

		Point p = protagonist.getIndividualLotcation();
		Point rad = new Point(34, 90);
		// 碰撞检测
		if (Collision.mapTesting(mapcollisiontest, p, rad)) {
			protagonist.dealWithKeychar(keychar);

			p = protagonist.getIndividualLotcation();
			if (Collision.mapTesting(mapcollisiontest, p, rad) == false) {
				if (keychar == 'w' || keychar == 'W') {
					keychar = 's';
				} else if (keychar == 's' || keychar == 'S') {
					keychar = 'w';
				} else if (keychar == 'a' || keychar == 'A') {
					keychar = 'd';
				} else if (keychar == 'd' || keychar == 'D') {
					keychar = 'a';
				}
				protagonist.dealWithKeychar(keychar);
			}
		}
	}

	@Override
	public void run() {
//		List<Weapon> list = new ArrayList<Weapon>();
//		List<Thread> list2 = new ArrayList<Thread>();

		for (int i = 0; true;) {
			if (bloodpro <= 0) {
				int res = JOptionPane.showConfirmDialog(null, "选择是返回主菜单(暂时没实现))，选择否结束游戏", "是否继续",
						JOptionPane.YES_NO_OPTION);
				if (res == JOptionPane.YES_OPTION) {
					System.exit(0);
				} else {
					System.exit(0);
				}
			}
			protagonist.getBlood().setSize(bloodpro, 10);
			if (i == 99) {
				i = 0;
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (Archer.weap) {
//				list.add(i, new Weapon());
//				list.get(i).setLocation(archerone.getLocation());
				Weapon weap = new Weapon();
				weap.setLocation(archerone.getLocation());
				weap.setVisible(true);
				this.add(weap);
				Thread thead10 = new Thread(weap);
				thead10.start();
				i++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
