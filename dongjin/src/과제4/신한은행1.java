package 과제4;

public class 신한은행1 extends Bank1{ //상속받은것
	final String 신한은행1="1";
	@Override // 재정의한것 근데  하나만 계좌만재정의하면되서 이것만사용
	public void 계좌등록하기() {
					System.out.println("=============신한은행계좌등록하기==========");
	}
	
	
}
