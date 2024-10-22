package chapter03.switchtest;
import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		/*
		사용자로부터 요일을 입력받아(1~7) 해당 요일에 어떤 음식을 먹을지 출력하는 프로그램을 작성하세요.
		(월요일:떡볶이, 화요일:스파게티,------,일요일:초밥)-->여러분이 먹고싶은거 아무거나 
		 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("요일을 입력하세요 (1~7): ");
        
        // 사용자 입력 받기
        int day = scanner.nextInt();
        String food="잘못된 입력";
        String date="잘못된 입력";

        // switch 문을 사용하여 요일에 따른 음식 결정
        switch (day) {
            case 1:
                food = "떡볶이";   // 월요일
                date = "월";
                break;
            case 2:
                food = "스파게티"; // 화요일
                date = "화";
                break;
            case 3:
                food = "치킨";     // 수요일
                date = "수";
                break;
            case 4:
                food = "피자";     // 목요일
                date = "목";
                break;
            case 5:
                food = "불고기";   // 금요일
                date = "금";
                break;
            case 6:
                food = "햄버거";   // 토요일
                date = "토";
                break;
            case 7:
                food = "초밥";     // 일요일
                date = "일";
                break;
            default:
                food = "잘못된 입력입니다. 1에서 7 사이의 숫자를 입력하세요.";
                break;
        }

        // 결과 출력
        System.out.println(date+"요일에 먹을 음식: " + food);
        
        scanner.close();
    }
}
