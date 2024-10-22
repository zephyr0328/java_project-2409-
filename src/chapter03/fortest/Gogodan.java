package chapter03.fortest;

public class Gogodan {

	public static void main(String[] args) {
		/*int i;
		System.out.println("2단:");
		for (i = 1; i < 10; i++) {
			int result = 2 * i;
			System.out.println("2 x " + i + " = " + result);
		}
		System.out.println("3단:");
		for (i = 1; i < 10; i++) {
			int result = 3 * i;
			System.out.println("3 x " + i + " = " + result);
		}
		System.out.println("4단:");
		for (i = 1; i < 10; i++) {
			int result = 4 * i;
			System.out.println("4 x " + i + " = " + result);
		}
		System.out.println("5단:");
		for (i = 1; i < 10; i++) {
			int result = 5 * i;
			System.out.println("5 x " + i + " = " + result);
		}
		System.out.println("6단:");
		for (i = 1; i < 10; i++) {
			int result = 6 * i;
			System.out.println("6 x " + i + " = " + result);
		}
		System.out.println("7단:");
		for (i = 1; i < 10; i++) {
			int result = 7 * i;
			System.out.println("7 x " + i + " = " + result);
		}
		System.out.println("8단:");
		for (i = 1; i < 10; i++) {
			int result = 8 * i;
			System.out.println("8 x " + i + " = " + result);
		}
		System.out.println("9단:");
		for (i = 1; i < 10; i++) {
			int result = 9 * i;
			System.out.println("9 x " + i + " = " + result);
		}*/
		
		int i;
		int j;
		int result;
		for(i=2;i<=9;i++) {
			System.out.println(i+"단 :");
			for(j=1;j<=9;j++) {
				result=(i*j);
				System.out.println(i+" x "+j+" = "+result);
			}
			System.out.println();
		}
	}

}
