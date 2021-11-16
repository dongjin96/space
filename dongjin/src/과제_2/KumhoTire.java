package 과제_2;

public class KumhoTire extends Tire { // Tire 에서 상속 받겠다 라는뜻

	public KumhoTire(int max_rotation, String location) { // 클래스 내에서 사용할수있게
		super(max_rotation, location); // 부모클래스에서 공통 부분을 가져온다
	}

	@Override // 다른 클래스에서 메소드 따라쓴걸 재정의해서 @override사용
	public boolean roll() {
		++accumulated_rotation;
		if (accumulated_rotation < max_rotation) {
			System.out.println(location + " 금호타이어 사용가능횟수 :" + (max_rotation - accumulated_rotation) + "회");// 사용가능 한
																											// 금호타이어 +
																											// 최대 출력 -
																											// 누적횟수 )+회
			return true;
		} else {
			System.out.println("*** " + location + " " + "KumhotireTire 펑크 *** ");// 앞뒤좌우 구별해서 한국타이어 펑크
		}

		return false;
	}

}
