package 과제14;

import java.util.ArrayList;
import java.util.Scanner;

public class 과제15_1 {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 0. 리스트 객체에 Interger 객체들을 저장
		ArrayList<Integer> list = new ArrayList<>();
		while(true) {
			////////////////////////////////////////////////////////////
			System.out.println(" ----- 대기 현황 ------ ");
			for( int i = 0 ; i<list.size() ; i++ ) {
				System.out.println("대기번호 : "+ (i+1) +"번 " + " 인원 : " + list.get(i) );
			}
			///////////////////////////////////////////////////////////
			System.out.println("1.명단추가 2.명단취소 3.[관리자]명단입장 ");
			int ch = scanner.nextInt();
			if( ch == 1 ) {  
				System.out.print(" 인원수 : "); int count = scanner.nextInt();
				// 1. 리스트에 객체 저장
				list.add( count );
				System.out.println(" **고객님의 대기번호 : " + list.size() );
			}
			else if( ch == 2 ) {
				System.out.print(" 취소할 대기번호 : " ); int num = scanner.nextInt();
				// 2. 리스트에 객체 삭제 
				list.remove(num-1); // -1 를 하는 이유 [ 대기번호는 1부터  // 인덱스 0부터 ]
				System.out.println(" **취소 되었습니다 ");
			}
			else if( ch == 3 ) {
				if( list.isEmpty() ) {
					System.out.println(" ** 대기중인 고객이 없습니다 ");
				}else {
					System.out.println(" ** 대기번호 1번 입장 ");
					list.remove(0); // 대기번호 1번 삭제 
				}
			}
			
		} // while end 
	} // main e
}
