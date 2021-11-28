package 과제4;



public class 계좌프로그램1 {
	
	
	public static Bank1[] banklist= new Bank1[100];// 리스트 선언 그런데 public static 이있어야  다른곳에서도 사용가능
	public static void main(String[] args) {
		ATM1 atm;    //인터페이스 불러오기
		atm = new 국민은행1();			// 국민은행 가져오기
		atm.계좌등록하기();				//메소드 불러오기
		atm.예금하기();
		atm.입금하기();
		atm.잔액확인하기();
		
		
		atm= new 신한은행1();				// 국민은행 가져오기
		atm.계좌등록하기();				//메소드 불러오기
		
		
		
		Bank1 account1= new Bank1();			//계좌 구분해서 저장하기
		banklist[0]= account1; 
		신한은행1 account2 = new 신한은행1();
		banklist[1]= account2;
		국민은행1 account3 = new 국민은행1();
		banklist[2]= account3;
							
	}
	
	
}
