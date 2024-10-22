package chapter03.fortest;

public class ForTest06 {

	public static void main(String[] args) {
		
		int i;
		int sum=0;
		for(i=0;i<=100;i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println("1부터 100까지의 수 중에서 3의 배수의 합 : "+sum);
	}

}
