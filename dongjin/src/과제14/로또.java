package 과제14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class 로또 {
	

//	문제2: set 컬렉션
//	* 로또 프로그램
//		
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);// 입력 객체선언
		HashSet<Integer> set = new HashSet<>();
		/*HashSet과 TreeSet이 있는데 HashSet의 경우 정렬을 해주지 않고 
		 * TreeSet의 경우 자동정렬을 해준다는 차이점이 있다
		 * 또 Set의 가장 큰 장점은 중복을 자동으로 제거해준다*/
		
		while(true) {
			System.out.print(" 1~45 숫자 선택(중복불가) : ");
			int num = scanner.nextInt();
			
			if( num < 1 || num > 45 ) { // 입력한 값이 0보자작거나 또는 45보다크면
				System.out.println("**선택할수 없는 번호");
			}
			else {
				// 중복확인 
				if( set.contains(num) ) {//입력받은 값이 포함되면 중복체크에 걸려버린다
					System.out.println("** 중복 번호 입니다");
				}else {
					set.add(num); // 그렇지않으면 저장된다
					System.out.println(" 확인 : "+ set );
				}
			}
			// 무한루프 끝나느 조건 : 6개 모두 입력 되었을때
			if( set.size() == 6 ) break; // 배열의 최대 길이를 6으로 설정해서 6개가 다체워지면 break를 건다
		}
	}
}
