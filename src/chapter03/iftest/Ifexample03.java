package chapter03.iftest;

import javax.swing.JOptionPane;

public class Ifexample03 {

	public static void main(String[] args) {

		int jumsu;

		jumsu = Integer.parseInt(JOptionPane.showInputDialog("Java ����"));

		/*// #1
		if (jumsu >= 90) {
			System.out.println('A');
		} else if (jumsu >= 80) {
			System.out.println('B');
		} else if (jumsu >= 70) {
			System.out.println('C');
		} else if (jumsu >= 60) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}*/
		//#2
		if(jumsu>=90) {
			System.out.println("�ֿ�� �л��Դϴ�.\n����� ������ : "+'A'+"�Դϴ�.");
		}else if(jumsu>=80) {
			System.out.println("��� �л��Դϴ�.\n����� ������ : "+'B'+"�Դϴ�.");
		}else if(jumsu>=70) {
			System.out.println("����� ������ : "+'C'+"�Դϴ�.");
		}else if(jumsu>=60) {
			System.out.println("����� ������ : "+'D'+"�Դϴ�.");
		}else {
			System.out.println("����� ������ :"+'F'+"�Դϴ�.");
		}
		
		
		
		
		
	}

}
