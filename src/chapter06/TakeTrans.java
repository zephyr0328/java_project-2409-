package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		
		//�л� 2�� ����(studentJames,studentTom)
		StdInfo studentJames=new StdInfo("James", 15000);
		StdInfo studentTom=new StdInfo("Tom", 12000);
		
		//����Ÿ��
		Bus bus100=new Bus("100��");
		studentJames.takeBus(bus100);
		//James
		studentJames.showInfo();
		bus100.showInfo();
		System.out.println("=================");
		//����Ÿ��(999)
		Bus bus999=new Bus("999��");
		studentTom.takeBus(bus999);
		studentTom.showInfo();
		bus999.showInfo();
		System.out.println("====================");
		
		Subway sub2=new Subway("line2");
		studentJames.takeSubway(sub2);
		studentJames.showInfo();
		sub2.showInfo();
		System.out.println("==================");
		
		Subway sub3=new Subway("line3");
		studentTom.takeSubway(sub3);
		studentTom.showInfo();
		sub3.showInfo();
	}
}
