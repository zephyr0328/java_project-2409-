package chapter04;

public class Example02 {

	public static void main(String[] args) {
		// for문을 이용하여 다음 배열의 점수를 줄단위로 평균을 구하시오
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		double avg = 0;
		double totalavg = 0;
		int total = 0;
		int alltotal = 0;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				total += array[i][j];
				count++;
			}
			alltotal += total;
			avg = (double) total / array[i].length;
			System.out.println((i + 1) + " 행의 합: " + total);
			System.out.println((i + 1) + " 행의 평균: " + avg);
			total = 0;
		}
		System.out.println("각 행의 합" + alltotal);
		totalavg = (double) alltotal / count;
		System.out.println("전체의 평균" + totalavg);

	}

}
