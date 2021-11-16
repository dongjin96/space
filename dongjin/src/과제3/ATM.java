package 과제3;

public interface ATM { //ATM  인터페이스 는 공통되는거를 상속한다  extend 와다르게 중복이가능하다
	
	//추상메소드 안에 따로 적지않음
	public void 계좌등록();
	public void 예금();
	public void 출금();
	public void 잔고();
	// default 같은 패키지 속클래스 허용가능하다
	default void 실행() {System.out.println(" ATM 실행 합니다 ");}
	
	
}
