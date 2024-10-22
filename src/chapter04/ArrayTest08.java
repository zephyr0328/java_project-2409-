package chapter04;

public class ArrayTest08 {

	public static void main(String[] args) {
		
		int[] score= {98,90,87};
		int sum=0;
		double avg;
		int i;
		for(i=0;i<score.length;i++) {
			System.out.print(score[i]+"   ");
			sum+=score[i];
		}
		System.out.println();
		avg=(double)sum/score.length;
		System.out.println("ÃÑÁ¡ : "+sum+"   Æò±Õ(¹Ý¿Ã¸²) : "+Math.round(avg));

	}

}
