package chapter14.dataIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamEx01 {

	public static void main(String[] args) {
		String filePath = "datastream.dat";
		
		// DataOutputStream�� ����Ͽ� ������ ����
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
			dos.writeInt(42);
			dos.writeDouble(3.14);
			dos.writeUTF("Hello Soldesk");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// DataInputStream�� ����Ͽ� ������ �б�
		 try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
	            int number = dis.readInt();
	            double decimal = dis.readDouble();
	            String message = dis.readUTF();

	            System.out.println("���� ������:");
	            System.out.println("����: " + number);
	            System.out.println("�Ǽ�: " + decimal);
	            System.out.println("���ڿ�: " + message);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}
