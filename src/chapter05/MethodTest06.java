package chapter05;

import javax.swing.JOptionPane;

public class MethodTest06 {
	// �ߺ��˻� �޼ҵ�
	public static boolean contains(int[] arr, int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return true;
				}
			}
		return false;
	}

	public static void main(String[] args) {
		
		int number = Integer.parseInt(JOptionPane.showInputDialog("���ϴ� �ζ� ����Ƚ���� �Է��ϼ���."));
		
		int cnt = 0;
		System.out.println("===�̹��� �ζ� �����ȣ===");
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
