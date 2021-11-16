package 과제_2;



public class 타이어 {
public static void main(String[] args) {
	
	
	
	Car car = new Car();
	
	for (int i = 0; i < 5; i++) {
		int problemlocation = car.run();
		switch(problemlocation) {
		case 1 :
			System.out.println("앞왼쪽타이어 HanKookTIRE 로 교체");
			car.frontlefttire = new HankookTire(15,"앞왼쪽");
			break;
		case 2:
			System.out.println("앞오른쪽타이어 HanKookTIRE 로 교체");
			car.frontrighttire = new HankookTire(15,"앞오른쪽");
			break;
		case 3:
			System.out.println("뒤왼쪽쪽타이어 KunhoTire 로 교체");
			car.backlefttire = new KumhoTire(15,"앞오른쪽");
			break;
		case 4:
			System.out.println("뒤오른쪽타이어 HanKookTIRE 로 교체");
			car.backrighttire = new KumhoTire(15,"앞오른쪽");
			break;
			
		
		}
		System.out.println("----------------------------");
	}
	
	
	
	
	
	
	
	
	
	
}
	
	
	
}


	