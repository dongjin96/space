package 과제_2;


public class HankookTire  extends Tire{ // Tire를 상속
	
	public HankookTire (int max_rotation, String location) { 
		super(max_rotation, location);  // 최대출력수와  위치를 공통적으로 사용해서 상속받음
	}

	@Override  // 다른 클래스 의 메소드를 사용하면서  다시 사용하면서 재정의한다 그래서 @override사용
	public boolean roll() {  // 작동을 판단
		++accumulated_rotation; //누적 회전수 증가  (작동할떄)
		if (accumulated_rotation < max_rotation) {// 만약에 최대회전수보다 누적바퀴수가 작으면
			System.out.println(location + " 한국타이어 사용가능횟수 :" + (max_rotation - accumulated_rotation) + "회");
																										// 위치와  최대출력수에서 - 누적바퀴수를 뺴면서 가능횟수를 알려준다
			return true; // 반환값 true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 *** ");  // 어디 타이어 가 펑크났음을알려준다
		}

		return false; // 반환값 false
	}

}


