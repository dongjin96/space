package ����10_day13_����2;

public class Music extends Thread {

	static boolean stop=true; // stop =true;��� �����ĸ��� Ŭ���� ������ ����ϱ����ظ���
	
	public static void musicstart(boolean �������) {  // �μ��� �������
		
		
		stop = �������;  
		if( stop ) {System.out.println("---���ǽ���");} 
		else { System.out.println("---��������");}
		
	}
	
	
	@Override
	public void run() {// ��ӹ޾Ƽ� ������Ŵ
	
				while(stop) { //��stop�� true �� ��ӵ��ư�
						System.out.println("===����������Դϴ�===");
						
						try {
							sleep(1000);  // ����ó�� �ʼ� ���ڴ� �ð��ǹ�
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
				}
		
	}
	
	
}