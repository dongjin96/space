package ����9_���������;


class ���̱� extends Thread {
	
	
	private static ���̱� ���̱� = new ���̱�();
	public ���̱�() {
		// TODO Auto-generated constructor stub
	}
	public void name() {
		
	}
	public static ���̱� ���̱�() {
		return ���̱�;
	}
	
	
	
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("���ۺ���"+(3-i)+"�г��ҽ��ϴ�");
		
		
		
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
		
		
		
	}
	
		
}

    

  