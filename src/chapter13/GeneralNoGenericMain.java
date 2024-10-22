package chapter13;

public class GeneralNoGenericMain {

	public static void main(String[] args) {
		GeneralNoGeneric general = new GeneralNoGeneric();

		// 정수형 배열
		Integer[] iArr = { 10, 20, 30, 40, 50 };
		general.printArr(iArr);

		Double[] jArr = { 10.1, 20.1, 30.1, 40.1, 50.1 };
		general.printDoubleArr(jArr);

		Character[] cArr = { 'a', 'b', 'c', 'd', 'e' };
		general.printCharArr(cArr);

	}

}
