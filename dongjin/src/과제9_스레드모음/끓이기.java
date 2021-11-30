package 과제9_스레드모음;


class 끓이기 extends Thread {
	
	
	private static 끓이기 끓이기 = new 끓이기();
	public 끓이기() {
		// TODO Auto-generated constructor stub
	}
	public void name() {
		
	}
	public static 끓이기 끓이기() {
		return 끓이기;
	}
	
	
	
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("보글보글"+(3-i)+"분남았습니다");
		
		
		
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
		
		
		
	}
	
		
}

    

  