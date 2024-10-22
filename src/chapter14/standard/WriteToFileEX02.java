package chapter14.standard;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteToFileEX02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("파일에 저장할 내용을 입력하세요 : ");
		String content = scanner.nextLine();
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
			writer.write(content);
			System.out.println("내용이 파일에 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일을 쓰는 도중 오류 발생 : "+e.getMessage());
		}finally {
			scanner.close();
		}
		
	}

}
