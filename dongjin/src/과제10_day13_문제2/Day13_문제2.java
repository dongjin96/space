package 과제10_day13_문제2;

import java.util.Scanner;

public class Day13_문제2 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean 음악재생 = true;// 음악 의 전원버튼
		boolean 영화재생 = true;// 영화의 전원버튼

		while (true) { // 무한으로 돌림
			System.out.println("1.음악듣기 2. 영화보기 >>:");  // 선택
			int ch = scanner.nextInt();  // 정수로받아 시작
			if (ch == 1) {
				Thread thread = new Music(); //music 클래스 에 매소드 가있음 그리고 thread를 생성해야 start를 할수있음 해당클래스에 thread 객체생성
				if (음악재생) {
					Music.musicstart(음악재생); //Music클래스에 musicstart메소드를호출하는데 음악재생이라는 인수를 사용
					thread.start(); // 스타트
					음악재생 = false; // 리턴값 false로바꿈
				} else {
					Music.musicstart(음악재생);
					음악재생 = true; //리턴값 true로바꿈
				}

			} else if (ch == 2) {
				Thread thread = new Movie(); // 영화클래스에 메소드가있음 
				if (영화재생) {

					Movie.moviestart(영화재생); //영화클래스에서 영화 시작 메소드를 불러옴 인수를 영화재생사용 
					thread.start();//스타트
					영화재생 = false; // 리턴값 false로바꿈

				} else {
					Movie.moviestart(영화재생);
					영화재생 = true; //리턴값 true로바꿈
				}

			}
		}

	}
}
