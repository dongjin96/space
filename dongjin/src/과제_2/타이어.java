package ����_2;



public class Ÿ�̾� {
public static void main(String[] args) {
	
	
	
	Car car = new Car();
	
	for (int i = 0; i < 5; i++) {
		int problemlocation = car.run();
		switch(problemlocation) {
		case 1 :
			System.out.println("�տ���Ÿ�̾� HanKookTIRE �� ��ü");
			car.frontlefttire = new HankookTire(15,"�տ���");
			break;
		case 2:
			System.out.println("�տ�����Ÿ�̾� HanKookTIRE �� ��ü");
			car.frontrighttire = new HankookTire(15,"�տ�����");
			break;
		case 3:
			System.out.println("�ڿ�����Ÿ�̾� KunhoTire �� ��ü");
			car.backlefttire = new KumhoTire(15,"�տ�����");
			break;
		case 4:
			System.out.println("�ڿ�����Ÿ�̾� HanKookTIRE �� ��ü");
			car.backrighttire = new KumhoTire(15,"�տ�����");
			break;
			
		
		}
		System.out.println("----------------------------");
	}
	
	
	
	
	
	
	
	
	
	
}
	
	
	
}


	