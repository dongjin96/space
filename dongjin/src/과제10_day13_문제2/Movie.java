package 과제10_day13_문제2;

public class Movie extends Thread {

	static boolean stop = true; // stop =true;라고 설정후만듬 클래스 내에서 사용하기위해만듬

	public static void moviestart(Boolean 영화재생) { // 인수가 영화재생

		stop = 영화재생;
		if (stop) {
			System.out.println("영화를재생합니다");
		} else {
			System.out.println("영화를종료합니다");
		}
	}

	@Override
	public void run() {// 상속받아서 구현시킴
		while (stop) {
			System.out.println("=====영화를재생합니다====");

			try {
				sleep(1000);// 예외처리 필수 숫자는 시간의미
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
