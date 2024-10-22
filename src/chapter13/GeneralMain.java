package chapter13;

public class GeneralMain {

	public static void main(String[] args) {
		General general = new General();

		// 정수형 배열
		Integer[] iArr = { 10, 20, 30, 40, 50 };
		general.printArr(iArr);

		Double[] jArr = { 10.1, 20.1, 30.1, 40.1, 50.1 };
		general.printArr(jArr);

		Character[] cArr = { 'a', 'b', 'c', 'd', 'e' };
		general.printArr(cArr);
		
	}

}
