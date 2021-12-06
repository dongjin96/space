package 과제14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 지하철 {
	/*
	 * 
	 *  
	문제3 :  지하철 관제 ( Queue )
		[조건1] : 역 4개 ( 종점역 -> 용산 -> 서울 ->구로-> 종점역 )
		[조건2] : 전철 3개 객체 [ 종점역에 3개 전철 대기 ]
		[조건3] : 출발 신호를 받아서 해당역에서 출발해서 다음으로 도착 
		[조건4] : 역 당 소요시간 2초
	
		출발신호 메뉴 
		1. 종점 2.용산 3.서울 4.구로 
	
		[ 예시 ] 1번 선택시 종점역에 먼저 들어온 전철을 다음역으로 이동 
		[ 예시 ] 만일 해당역에 전철이 없으면 없다 출력 
	
		[출력 예 ]
			----현 전철역  현황 -----
			종점역 :  전철3 , 전철4
			용산역 :  전철2
			서울역 :  전철1 
			구로역 :  
			---------- 출발 신호 --------
			1. 종점 2.용산 3.서울 4.구로 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		Queue<String> 종점역 = new LinkedList<String>();
		Queue<String> 용산역 = new LinkedList<String>();
		Queue<String> 서울역 = new LinkedList<String>();
		Queue<String> 구로역 = new LinkedList<String>();
		/*Queue는 줄을 기다리는 것을 말한다 예를들어 사람 차량등이 줄을서서기다릴는 것을말하는데
		 * 이처럼 큐는 데이터를 먼저온 순서데로 내보낸다 터널이 이라고 생각하면 될거같다
		 * 그리고 큐눈LinkedList를 활용해야한다*/
		종점역.offer("1번전철");
		종점역.offer("2번전철");
		종점역.offer("3번전철");
		
		while(true) { // 무한돌리기
			System.out.println(종점역);
			System.out.println(용산역);
			System.out.println(서울역);
			System.out.println(구로역);
			System.out.println("1.종점 2.용산 3.서울 4.구로"); //역선택
			int ch = scanner.nextInt();
			
			if(ch==1) { //종점을선택하면
				System.out.println(종점역);
				if(!종점역.isEmpty()) { //종점이 비어있지않으면
					Thread.sleep(2000);	//2초의시간이흐른뒤
					System.out.println("출발 : "+종점역.peek()); //peek 삭제없이 요소를 읽어온다 큐가 비어있으면 널값을준다 // stack 맨위에저장된 객체를 반환한다
					용산역.offer( 종점역.poll() );
				}/*여기에서 offer 은 저장 을하러 들어가는것이고
				여기에서 poll은 저장한값을 내보내는 것이다*/
			}
			if(ch==2) {
				System.out.println(용산역);
				if(!용산역.isEmpty()) {//용산역이 비어있지않으면
				Thread.sleep(2000);// 이초동안 기다렸다가
				System.out.println("출발 : "+용산역.peek());  // 제일 위에있는 객체를 가져온다
				서울역.offer(용산역.poll());
				}//서울역에서는 저장값을받고 용산역에서는보낸다 
			}
			if(ch==3) {
				System.out.println(서울역);
				if(!서울역.isEmpty()) {
				Thread.sleep(2000);	
				System.out.println("출발 : "+서울역.peek());	// 서울역 제일 위에있는 객체를 가져온다
				구로역.offer(서울역.poll());
				}//구로역이 객체를 전달받고 서울역이 내보낸다
			}
			if(ch==4) {
				System.out.println(구로역);
				if(!구로역.isEmpty()) {
				Thread.sleep(2000);	
				System.out.println("출발 : "+구로역.peek());	// 구로역제일 위에있는 객체를 가져온다
				종점역.offer(구로역.poll());
				}//종점에서는받고 구로역에서는 내보낸다
				/*만약에 stack이었으면 PoP이내보내는것이고 push가 저장하는것이다*/
			}
		}
	}
}
