package chapter06;


import javax.swing.JOptionPane;

public class SungJuk {
	
	//�ʵ� �Ǵ� �������
			private String std_num;
			private String std_name;
			private int java, oracle, spring;
			
			//����Ʈ ������
			
			//�޼���
			public void Sum() {
				double total=java+oracle+spring;
				System.out.println("�� �հ�: "+total);
			}
			public void Avg()	{
				double total=java+oracle+spring;
				double avg=total/3.0;
				System.out.println("���: "+avg);
			}
	public static void main(String[] args) {
		//(rec)��ü(=�ν��Ͻ� ����)����
		SungJuk rec=new SungJuk();
		
		rec.std_num=JOptionPane.showInputDialog("�й�");
		rec.std_name=JOptionPane.showInputDialog("����");
		
		rec.java=Integer.parseInt(JOptionPane.showInputDialog("�ڹ�����"));
		rec.oracle=Integer.parseInt(JOptionPane.showInputDialog("����Ŭ����"));
		rec.spring=Integer.parseInt(JOptionPane.showInputDialog("����������"));
		
		System.out.println("�й�-"+rec.std_num+"| ����-"+rec.std_name+"���� �����Դϴ�.");
		System.out.println("-----------------------------------------------------------------------");
		rec.Sum();
		rec.Avg();
		
		

	}

}
