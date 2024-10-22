package chapter14.byteinout;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOStreamEx03 {

	public static void main(String[] args) {
		String data = "Hello, this is a test of FileInputStream and FileOutputStream.";
		String filePath = "IOStream.txt";

		// 파일에 데이터 쓰기
		try (FileOutputStream fos = new FileOutputStream(filePath)) {
			fos.write(data.getBytes());
			System.out.println("성공적으로 데이터를 저장했습니다.");
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다." + e.getMessage());

		}

		System.out.println("==============================");

		// 파일에서 데이터 읽기
		try (FileInputStream fis = new FileInputStream(filePath)) {
			int byteData;
			System.out.println("파일 내용 : ");

			while ((byteData = fis.read()) != -1) {
				System.out.print((char) byteData);
			}
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다." + e.getMessage());
		}
	}

}
