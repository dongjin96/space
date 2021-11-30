package 과제9_스레드모음;


class 끓이기 extends Thread {
	

	
	
	public void run() {
		for (int i = 0; i < 3; i++) { // for문 돌려서  최대 3번 으로 지정
			System.out.println("보글보글"+(3-i)+"분남았습니다");	//3-i 해서 일씩줄어서 3 2 1 순서로 분알려줌
		
		
		
		try {
			sleep(1000); // 시간 정하기
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
		
		
		
	}
	
		
}

    

  