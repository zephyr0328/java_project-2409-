package chapter13;

import java.util.Vector;

public class A {

	public static void main(String[] args) {
			
		// VectorExample ��ü ����
        VectorShared vectorExample = new VectorShared();
        
        // ù ��° ������
        Thread thread1 = new Thread(() -> {
            vectorExample.addDataToVector(5); //ù ��° �����忡�� 5���� ������ �߰�
        }, "1");
        
        // �� ��° ������
        Thread thread2 = new Thread(() -> {
            vectorExample.addDataToVector(5); //�� ��° �����忡�� 5���� ������ �߰�
        }, "2");
        
        //��Ƽ ������ ����
        thread1.start();
        thread2.start();
        
        // �� �����尡 ���� ������ ���
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        //���
        vectorExample.printVector();
        

	}

	}


