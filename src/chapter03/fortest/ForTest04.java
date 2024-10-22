package chapter03.fortest;

public class ForTest04 {

	public static void main(String[] args) {
		
		int num;
		int total = 0;
		
		for(num=1;num<=100;num++) {
			
			if(num%2==0) {
				continue; //그냥 가세요(무시)
			}
			System.out.println(num+" ");
			total+=num;
		}
		
		/*for(num=0;num<=100;num++) {
			boolean x=((num%2)!=0);
			if(x) {
				total+=num;
			}
		}*/
		System.out.println(total);
	}

}
