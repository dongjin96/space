package 과제4;

public interface ATM1 {    // 인터페이스는 class와 다르기때문에 class를 지우고 넣는다
	
	//<추상메소드> interface속 추상메소드는 아무것도 할수없다 
	public void 예금하기();
	public void 입금하기();
	public void 계좌등록하기();
	public void 잔액확인하기();
	
	//default  선언 ok  재정의 x (오락실 게임기 동전넣는거)
	default void 실행하기() {System.out.println("====ATM실행하기========");}

}
