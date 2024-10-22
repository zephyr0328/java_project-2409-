package chapter16;

public class MyNumberEx02Main {

	public static void main(String[] args) {
		// 规过 1
		/*
		 MyNumber aa = new MyNumber() {
		 
		 @Override public int getMax(int x, int y) { int max1 = (x >= y) ? x : y;
		  return max1; } }; System.out.println(aa.getMax(5, 6));
		 */
		// =============================

		// 规过2
		MyNumber max2 = (x, y) -> (x >= y) ? x : y;
		System.out.println(max2.getMax(5, 6));
	}

}
