package 과제3;

public class 신한은행 extends Bank {

	final String 은행코드 = "01"; // final 재정의 불가한다 근데 override?? 를사용
	
	@Override
	public void 계좌등록() {
		System.out.println("------신한은행 계좌 등록-----");
	}
}
