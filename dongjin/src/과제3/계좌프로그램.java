package 과제3;

public class 계좌프로그램 {
public static Bank[] banklist = new Bank[100]; // 은행리스트 100 개만든다
	
	public static void main(String[] args) {
		
		ATM atm;  // 인터페이스 가져오기
		
		atm = new 국민은행(); //인터페이스 클래스를 국민은행 클래스 로바꾼다??
		// 그러면 이거는 atm 에있는거 사용가능 
		atm.계좌등록();
		atm.예금();
		atm.출금();
		atm.잔고();
		
		//인터페이스 클래스를신한은행클래스로 바꾼다 
		atm = new 신한은행();
		atm.계좌등록();
		
		//  
		Bank account1 = new Bank();	
		banklist[0] = account1;
		
		국민은행 account2 = new 국민은행();
		banklist[1] = account2;
		
		신한은행 account3 = new 신한은행();
		banklist[2] = account3;
		
	}
}

