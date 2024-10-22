package chapter05;

import javax.swing.JOptionPane;

public class MethodTest06 {
	// 중복검사 메소드
	public static boolean contains(int[] arr, int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return true;
				}
			}
		return false;
	}

	public static void main(String[] args) {
		
		int number = Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매횟수를 입력하세요."));
		
		int cnt = 0;
		System.out.println("===이번주 로또 예상번호===");
		while(number>cnt) {
			System.out.print("["+ (cnt+1)+"] :");
			int lotto[]=new int[6];
			int index = 0;
			while(index < 6) {
				int num=(int)(Math.random()*45)+1;
				if(!contains(lotto,num)) {
					lotto[index++]=num;
				}
			}
			for(int num:lotto) {
				System.out.print(num+"  ");
			}
			System.out.println();
			cnt++;
		}
	}
}
