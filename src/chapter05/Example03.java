package chapter05;

public class Example03 {
	
	//최대값을 메소드로 구현
	public static int findMax(int a[]) {
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
		//향상for
		/*for(int num:a) {
			if(num>max) {
				max=num;
			}
		}*/
	}

	public static void main(String[] args) {
		int numbers[]= {7,2,9,1,5};
		int maxnum=findMax(numbers);
		System.out.println("최대값: "+maxnum);

	}

}
