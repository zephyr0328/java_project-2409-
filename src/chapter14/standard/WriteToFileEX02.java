package chapter14.standard;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteToFileEX02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���Ͽ� ������ ������ �Է��ϼ��� : ");
		String content = scanner.nextLine();
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
			writer.write(content);
			System.out.println("������ ���Ͽ� ����Ǿ����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("������ ���� ���� ���� �߻� : "+e.getMessage());
		}finally {
			scanner.close();
		}
		
	}

}
