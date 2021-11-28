package 과제5;

import java.util.Scanner;

public class Memberfile {


	
	
	public static Scanner scanner = new Scanner(System.in);
		
	public static Member[] members = new Member[100]; // 100 개의 정보를 저장
	
	
	public static void main(String[] args) {
		
		// 파일에 저장된 회원 가져오기 => 배열에 저장 
		while(true) {
			Member temp = new Member();
			temp.signup();
			/*temp : 변수를 교환하는 역할
			 * 임시 로 저장해서 두 값을 바꾸는 역할을한다 
			 */
		}
		
	}
}
