package chapter12.AnonyInner;

public class AnonyInnerMain {
	
	public void test() {
		new TestInter() {
			
			@Override 
			public void printData() {
				System.out.println("ȭ����!!");
				
			}//�߻�޼���
		}.printData();
	}// test()

	public static void main(String[] args) {
		
		AnonyInnerMain in = new AnonyInnerMain();
		in.test();

	}

}
