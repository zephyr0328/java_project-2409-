package chapter04;

public class TwoDimension01 {

	public static void main(String[] args) {
		//이차원 배열 
		int[][] arr=new int[2][3];
		int[]	a=new int[5];
		int n=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				n++;
				System.out.print((arr[i][j]=n)+"  ");
			}
			System.out.println();
		}
		System.out.println(arr.length);//[행][열] 행=> 2
		System.out.println(arr[0].length);
		System.out.println(a.length);
	}

}
