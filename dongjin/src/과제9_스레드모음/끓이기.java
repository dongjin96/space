package ����9_���������;


class ���̱� extends Thread {
	

	
	
	public void run() {
		for (int i = 0; i < 3; i++) { // for�� ������  �ִ� 3�� ���� ����
			System.out.println("���ۺ���"+(3-i)+"�г��ҽ��ϴ�");	//3-i �ؼ� �Ͼ��پ 3 2 1 ������ �о˷���
		
		
		
		try {
			sleep(1000); // �ð� ���ϱ�
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
		
		
		
	}
	
		
}

    

  