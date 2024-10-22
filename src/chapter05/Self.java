package chapter05;

import java.util.Scanner;

public class Self {
	public void fct(int n1,int fac) {
		Self obj=new Self();
		if(n1>0) {
			fac*=n1;
			n1--;
			obj.fct(n1,fac);
		}else {
			System.out.println(fac);
		}
	}

	public static void main(String[] args) {
		Self obj=new Self();
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		int fac1=1;
		obj.fct(num1,fac1);
		scanner.close();

	}

}
