package chapter15;

public class TreadEx02 extends Thread {

	private int[] temp;

	public TreadEx02() {
		temp = new int[10];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;
		}
	}//������

	@Override
	public void run() {
		
		for(int i:temp) {
			try {
				Thread.sleep(1000);//1��
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("temp : "+temp[i]);
		}
	}
	
}
