package day13_문제2;
public class Movie extends Thread {
	/*
	 * 스레드란 한개의 프로세스내에서 작업을 수행하는 역할을가지고있다 두개 이상이면 멀티스레드라고한다
	 * 프로세스 : 프로그램 
	 */
	static boolean stop = true; //다른곳에서도 사용가능하기위해static 사용
	
	public static void moviestop( boolean sw ) { // sw 재생여부 확인
		
		stop = sw;
		if( stop ) {System.out.println("---영화 시작");} 
		else { System.out.println("---영화 종료");}
		
	}
	
	@Override
	public void run() {
		while(stop) { // stop 이 true인 경우에만 실행 
			System.out.println(" 영화실행중~~~ ");
			try { Thread.sleep(1000); }// 1000이면 1초
			catch (Exception e) {}
		}	
	}

}
