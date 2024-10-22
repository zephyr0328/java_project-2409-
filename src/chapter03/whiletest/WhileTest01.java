package chapter03.whiletest;

public class WhileTest01 {

	public static void main(String[] args) {

		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			
			System.out.println("주사위의 눈: " + num);

			if (num == 6) {
				break;
			}
			/*Math.random() * 6에서의 * 6은 생성되는 랜덤 값의 범위를 조정하는 역할을 합니다.
			Math.random()은 0.0 이상 1.0 미만의 값을 생성합니다.
			이 값을 6과 곱하면, 결과는 0.0 이상 6.0 미만의 값이 됩니다.
			즉, 생성되는 값의 범위가 0부터 6까지로 확장됩니다.
			따라서, Math.random() * 6의 결과는 0.0 이상 6.0 미만의 실수 값이 되며,
			이를 정수로 변환하고 1을 더함으로써 최종적으로 1부터 6까지의 정수를 얻을 수 있습니다.*/
		}
	}

}
