package chapter04;

import javax.swing.JOptionPane;

public class TwoDimension02 {

	public static void main(String[] args) {

		int[][] javaScore = new int[2][3];

		for (int i = 0; i < javaScore.length; i++) {
			for (int j = 0; j < javaScore[i].length; j++) {
				javaScore[i][j] = Integer.parseInt(JOptionPane.showInputDialog("안녕"));// 스트링으로 받는데 정수형으로 형변환 해야해!!
				System.out.println("JavaScore[" + i + "]" + "[" + j + "]:" + javaScore[i][j]);
			}
			System.out.println();
		}
		
	}

}
