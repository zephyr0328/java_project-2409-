package chapter03.fortest;

public class Gpt {

	public static void main(String[] args) {
		//1���� 100 ������ 3�� ����� 5�� ����� ���� : xx�Դϴ�.
		/*int i;
		int j;
		int sum1=0;
		int sum2=0;
		
		for(i=0;i<=100;i++) {
			boolean x=((i%3)==0);
			boolean y=((i%5)==0);
			if(x) {
				sum1+=i;
			}
			if(y) {
				sum2+=i;
			}
		}
		
		int result=sum1+sum2;
		System.out.println("1���� 100������ 3�� ����� 5�� ����� ���� : "+result+"�Դϴ�.");*/
		
		int i;
		int sum=0;
		for(i=0;i<=100;i++) {
			if((i%3==0)||(i%5==0)) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
