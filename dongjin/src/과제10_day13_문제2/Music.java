package 과제10_day13_문제2;

public class Music extends Thread {

	static boolean stop=true; // stop =true;라고 설정후만듬 클래스 내에서 사용하기위해만듬
	
	public static void musicstart(boolean 음악재생) {  // 인수가 음악재생
		
		
		stop = 음악재생;  
		if( stop ) {System.out.println("---음악시작");} 
		else { System.out.println("---음악종료");}
		
	}
	
	
	@Override
	public void run() {// 상속받아서 구현시킴
	
				while(stop) { //ㄴstop은 true 라서 계속돌아감
						System.out.println("===음악재생중입니다===");
						
						try {
							sleep(1000);  // 예외처리 필수 숫자는 시간의미
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
				}
		
	}
	
	
}