package chapter10;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
		System.out.println("Computer Ŭ������ �޼���  areaCircle()");
		return Math.PI*r*r;
	}
	

}
