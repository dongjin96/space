package ��;



public class ��2 {
	 public static void main(String[] args) throws InterruptedException {        

	        InterruptTest t = new InterruptTest();

	        t.start();

	        t.interrupt();

	        //t �����尡 ������ �� ���� main Thread�� ��ٸ�

	        // join�� �����Ǹ� "Main Thread ����"�� ���� ���� ��µ�

	        t.join();  

	        System.out.println("Main Thread ����...");

	    }

	}