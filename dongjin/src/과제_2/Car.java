package 과제_2;


public class Car {
	
	// 앞왼쪽타이어 (int값 총회전가능수 ,위치);
	// 앞오른쪽타이어 (int값 총회전가능수 ,위치);
	// 뒤왼쪽타이어 (int값 총회전가능수 ,위치);
	// 뒤 오른쪽타이어 (int값 총회전가능수 ,위치);
	
	Tire frontlefttire = new Tire(8,"앞왼쪽"); // Tire 에 frontlefttire(타이어위치명)을 객체로 생성한다  (int ,"")타이어 사용 가능수 를int로두고 ""는 위치알려준다
	Tire frontrighttire= new Tire(10,"앞오른쪽");
	Tire backlefttire = new Tire(4,"뒤왼쪽");
	Tire backrighttire = new Tire(5,"뒤오른쪽");
	
	
	int run() {
		System.out.println("자동차가 달립니다");
		if (frontlefttire.roll()==false) {stop(); return 1;}// 자동차의 앞왼쪽바퀴가 달리지못하면  return 값을 1로보낸다
		if ( frontrighttire.roll()==false) {stop(); return 2;}// 자동차의 앞오른쪽바퀴가 달리지못하면  return 값을 1로보낸다
		if ( backlefttire.roll()==false) {stop(); return 3;}// 자동차의 뒤왼쪽바퀴가 달리지못하면  return 값을 1로보낸다
		if (backrighttire.roll()==false) {stop(); return 4;}// 자동차의 뒤오른쪽바퀴가 달리지못하면  return 값을 1로보낸다
		return 0;
	}


	private void stop() {// stop메소드 만들어줘야 위에 stop사용가능
		System.out.println("자동차가 멈춥니다");
		
		
	}
		
	}
	
	
	
	
	
	
	
	
