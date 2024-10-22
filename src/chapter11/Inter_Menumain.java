package chapter11;

public class Inter_Menumain implements Inter_Menu3 {

	public static void main(String[] args) {

		Inter_Menumain im = new Inter_Menumain();
		System.out.println("¿ì¸®°¡°Ô¸Ş´ºÆÇ");
		Inter_Menu1 im1=im;
		Inter_Menu2 im2=im;
		Inter_Menu3 im3=im;
		System.out.println("Inter_Menu1");
		System.out.println(im1.jajang());
		System.out.println(im1.JJambbong());

	}

	@Override
	public String jajang() {
		// TODO Auto-generated method stub
		return "Â¥Àå¸é";
	}

	@Override
	public String JJambbong() {
		// TODO Auto-generated method stub
		return "Â«»Í";
	}

	@Override
	public String tangsuyuck() {
		// TODO Auto-generated method stub
		return "ÅÁ¼öÀ°";
	}

	@Override
	public String boggembab() {
		// TODO Auto-generated method stub
		return "ººÀ½¹ä";
	}

}
