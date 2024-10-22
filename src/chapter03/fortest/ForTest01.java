package chapter03.fortest;

public class ForTest01 {

	public static void main(String[] args) {
		int sum = 1;

		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;

		System.out.println(sum);
		int i;
		System.out.println("1부터 10까지의 수 출력");
		System.out.println("\n====================================");
		for (i=0;i<10;i++) {
			System.out.print((i+1)+" ");
		}
		System.out.println("\n====================================");
		int k;
		for (k=0;k<10;++k) {
			System.out.print((k+1)+" ");
		}
		System.out.println("\n====================================");
		int j;
		int hap=0;
		
		for(j=1;j<=10;j++) {
			hap+=j; 
			System.out.println("Current j : "+j+", hap :"+hap);
		}
		
		System.out.println("\n1부터 10까지의 합: "+hap);
		int z;
		int hap2=0;
		for(z=1;z<=10;z++) {
			hap2+=z; 
			System.out.println("Current z : "+z+", hap2 :"+hap2);
		}
	}

}
