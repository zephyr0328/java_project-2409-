package chapter04;

public class ArgsTest01 {

	public static void main(String[] args) {
		//�迭
		int[] numbers=new int[5];
		
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		System.out.println("numbers�� ũ�� : "+numbers.length+"��");
		for(int i=0;i<numbers.length;i++) {
			
			System.out.println(i+" �� ���: "+numbers[i]);
		}

	}

}
