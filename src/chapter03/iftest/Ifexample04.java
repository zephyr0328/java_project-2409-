package chapter03.iftest;

import javax.swing.JOptionPane;

public class Ifexample04 {

	public static void main(String[] args) {
		/*
		 * 전시관의 입장료는 미취학 아동은 1000원 ->7
		 * 전시관의 입장료는 초등학생은 2000원->13 
		 * 전시관의 입장료는 중,고등학생은 3500원
		 * 전시관의 입장료는 성인은 5000원->19 
		 */

		int age;
		int charge;

		age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요"));

		if (age >= 20) {
			charge = 5000;
			System.out.println("전시관의 입장료는" + charge + "원 입니다.");
		} else if (age >= 14) {
			charge = 3500;
			System.out.println("전시관의 입장료는" + charge + "원 입니다.");
		} else if (age >= 8) {
			charge = 2000;
			System.out.println("전시관의 입장료는" + charge + "원 입니다.");
		} else if (age <= 0) {
			System.out.println("나이를 다시 입력해 주세요.");
		} else {
			charge = 1000;
			System.out.println("전시관의 입장료는" + charge + "원 입니다.");
		}

	}

}
