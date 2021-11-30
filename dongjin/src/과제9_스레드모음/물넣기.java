package 과제9_스레드모음;

public class 물넣기 extends Thread{
	
	private static 물넣기 물넣기 = new 물넣기();
	
	public 물넣기() {
		// TODO Auto-generated constructor stub
	}
	public static 물넣기 물넣기() {
		return 물넣기;
	}
	
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i+1+"물한컵");
		
		try {
			sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
	}
}
