package java15_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Day15_문제1_숙제 {
	
	
	
	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in); // scanner입력객체 선언 
		ArrayList<Integer>arrayList = new ArrayList<Integer>();//
		/*integer 은 int 의 레퍼클래스 라고할수있음
		 * 사용할떄는
		 *  매개변수로 객체를 필요로할떄 이다
		 *  매겨변수는 함수가 호출될때 인수로 전달된값을 함수내부에서 사용할수있게해주는 변수!!
		 * */
		while(true){
				
			System.out.println("------------대기현황-----------");
			for (int i = 0; i < arrayList.size(); i++) {// arraylist는 .size를쓴다
				System.out.println(i+1+":대기명단순서"+arrayList.get(i)+"인원수"); // i는 0부터 시작이니깐 1 +해줘서 시작 get(i)는 명단추가에서 입력받을값을 +"인원수에 넣음"
			}
			///////////////////////////////////////////////////////////////////
			System.out.println("1.명단추가 2.명단취소3.[관리자]명단입장");
			int ch =scanner.nextInt();
			if(ch==1) {
				System.out.println("인원수 :"); int count = scanner.nextInt();//1명단추가니깐 인원수를받아햐한다
				arrayList.add(count);	// 입력받은 인원수를 .add를통해서list에넣는다
				System.out.println("고객님의 대기번호:"+arrayList.size());// arraylsit.size()는 추가한만큼 배열을 돌리는거니깐 대기번호는 이걸로하는게맞다
				
			}
			else if(ch==2) {
			System.out.println(" 취소할 명단번호 :"); int count1 = scanner.nextInt(); //명단입ㅂ력
			arrayList.remove(count1-1); //대기번호가 1부터이고//인덱스가 0부터라서 .reamoveㄹ라는걸쓴다
			System.out.println("취소되었습니다");
			}
			else if (ch==3) {
				if (arrayList.isEmpty()) {
					System.out.println("대기중인 고객이없습니다");
					
				}else {
					System.out.println("입장합니다");
					arrayList.remove(0); // 인덱스에 저장된건 0부터는깐 0부터remove
				}
				
			}
			
		}	
		
	}
	
	
	

}
