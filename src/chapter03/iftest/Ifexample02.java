package chapter03.iftest;

import javax.swing.JOptionPane;

public class Ifexample02 {

	public static void main(String[] args) {
		//10�� ����� �Ǵ�
		//���� : dat�� �ִ� ���� 10���� ���� �������� 0�̸� ���
		
		int dat;
		
		dat=Integer.parseInt(JOptionPane.showInputDialog("���� �Է��ϼ���."));//1��������Ʈ���� ����� ��!
		
		if(dat%10 == 0)
		{
			System.out.println(dat+"��(��) 10�� ��� �Դϴ�.");
		} else {
			System.out.println(dat+"��(��) 10�� ����� �ƴմϴ�.");
		}
		

	}

}
