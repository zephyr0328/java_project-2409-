package chapter03.switchtest;

public class SwitchCase06 {

	public static void main(String[] args) {
		
		int time= (int)(Math.random()*10)+9;
		System.out.println("[현재시간: "+time+"시");
		System.out.print("할 일 : ");
		
		switch (time) {
		case 9: 
			System.out.println("설이 산책하기~");
			break;
		case 10:
			System.out.println("운동하기");
			break;
		case 11:
			System.out.println("씻기");
			break;
		case 12:
			System.out.println("밥먹기");
			break;
		case 13:
			System.out.println("공부하기");
			break;
		case 14:
			System.out.println("공부하기");
			break;
		case 15:
			System.out.println("공부하기");
			break;
		case 16:
			System.out.println("게임하기");
			break;
		case 17:
			System.out.println("게임하기");
			break;
		case 18:
			System.out.println("밥먹기");
			break;
		default:
			System.out.println("멍때리기!~~~~~");
		}

	}

}
