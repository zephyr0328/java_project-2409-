package chapter04;

public class Example01 {

	public static void main(String[] args) {
		// for문을 이용하여 다음 배열의 점수를 줄단위로 평균을 구하시오
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		double avg = 0;
		int count = 0;
		int sum[] = new int[3];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum[i] += array[i][j];
				count++;
			}
			System.out.println("각 행의 합: " + sum[i]);
			avg = sum[i] / (double) count;
			System.out.println("각 행의 평균: " + avg);
			count = 0;
		}
	}
}
