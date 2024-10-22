package chapter12.wrapperclass;

public class BoxingUnBoxingMain {

	public static void main(String[] args) {

		// AutoBoxing(Integer)
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(200);
		Integer obj3 = Integer.valueOf(300);

		Integer total1 = obj1 + obj2;
		Integer total2 = obj2 + obj3;

		System.out.println("Integer total1 : " + total1);
		System.out.println("Integer total2 : " + total2);

		// UnBoxing(int)
		int value1 = obj1.intValue();// ��ڽ�
		int value2 = obj2.intValue();// ��ڽ�
		int value3 = obj3.intValue();// ��ڽ�

		Integer total3 = value1 + value2;
		Integer total4 = value2 + value3;
		System.out.println("Integer total3 : " + total3);
		System.out.println("Integer total4 : " + total4);
		
		//AutoBoxing/UnBoxing
		System.out.println("-----------------------------");
		
		Integer obj=100; //AutoBoxing
		System.out.println("value : "+obj.intValue()); // UnBoxing
		
		//obj�� UnBoxing���� �ڵ� ����ȯ
		int value=obj;
		System.out.println("value : "+value);
		
		//���� �� �ڵ� UnBoxing���� ����ȯ
		int result=obj+100;
		System.out.println("result : "+result);
		
		//�÷����� ��ü�� �ν���
		
		
		
		
		
		
	}

}
