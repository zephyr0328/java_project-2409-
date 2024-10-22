package chapter03.fortest;

public class Gpt {

	public static void main(String[] args) {
		//1부터 100 까지의 3의 배수와 5의 배수의 합은 : xx입니다.
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
		System.out.println("1부터 100가지의 3의 배수와 5의 배수의 합은 : "+result+"입니다.");*/
		
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
