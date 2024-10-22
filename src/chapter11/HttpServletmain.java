package chapter11;

public class HttpServletmain {
	public static void method(HttpServlet c1) {
		c1.service();
	}

	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}

}
