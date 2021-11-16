package 과제_2;

public class Tire {// 클래스명
	public int max_rotation; // 최대 사용수
	public int accumulated_rotation; // 누적으로 돌아가는수
	public String location;  // 타이어의 위치
	
	
	
	
	
	
	
	public Tire(int max_rotation, String location) { // 외부 값 내부값 비교할수있게 
		super();
		this.max_rotation = max_rotation;
		this.location = location;
	}







	







	public boolean roll() { // 얼마나 사용할수있는지 판단.
		++accumulated_rotation;
		if (accumulated_rotation<max_rotation) {
			System.out.println("타이어 가능 바퀴수 :" + (max_rotation-accumulated_rotation));// 타이어의  가능 바퀴수를 = 최대사용가능한수 - 누적사용수 
			return true; //결과값을 true로
		}else {
			System.out.println("****"+location+"****"+" Tire 펑크 *** ");  // 어느 쪽바퀴 의 펑크인지알려줌
		}
		
		
		return false; // 결과값을 false로
	}
	
	
	
}