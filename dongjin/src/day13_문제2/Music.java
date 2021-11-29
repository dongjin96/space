package day13_문제2;

public class Music extends Thread {// Thread를 상속받는다
	/*
	 * 스레드란 한개의 프로세스내에서 작업을 수행하는 역할을가지고있다 두개 이상이면 멀티스레드라고한다
	 * 프로세스 : 프로그램 
	 */
	static boolean stop = true; // static 사용한이유는 다른 곳에서 도 사용할수있게/ stop이라 판단 하면 =true
	public static void musicstop(boolean sw) {//sw 재생여부 확인
		
		stop=sw;
		if(stop) {System.out.println("====음악시작");}
		else {System.out.println("=====음악종류");
			
		}
	}
	@Override// 상속받아서 overrride 구현해야함
	public void run() {
		while(stop) {// stop이 true인경우에만 실행
			System.out.println("음악실행중~~~~~");
			try {Thread.sleep(1000);  // 1000이면 1초
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
