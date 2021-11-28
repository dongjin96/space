package 과제4;

public class Bank1 implements ATM1{ // implement 구현한다 

	String 계좌번호;		
	int 잔액;
	
	
	
	
	
	// ATM에서 구현하지못한걸 구현한것
	@Override
	public void 계좌등록하기() {
							System.out.println("===========계좌등록하기=============");

	}

	@Override
	public void 입금하기() {
						System.out.println("============입금하기============");

	}

	@Override
	public void 예금하기() {
		  System.out.println("==================예금하기=================");

	}

	@Override
	public void 잔액확인하기() {
					System.out.println("=============잔액확인하기===========");

	}
	
}
