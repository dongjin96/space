package ����9_���������;

public class ���ֱ� extends Thread{
	
	private static ���ֱ� ���ֱ� = new ���ֱ�();
	
	public ���ֱ�() {
		// TODO Auto-generated constructor stub
	}
	public static ���ֱ� ���ֱ�() {
		return ���ֱ�;
	}
	
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i+1+"������");
		
		try {
			sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
	}
}
