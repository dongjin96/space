package 과제14;

import java.util.Scanner;
import java.util.Stack;

public class 역차순뽑기 {

	
	
	public static void main(String[] args) {
		/*stack 은
		  입력받아서 저장이되면 들어간 순으로 제일 밑으로 저장된다 (저장방법:statck.push)* 그리고 빠져나올떄는 나중에들어간순으로빠져나오게된다 Stack.Pop이다*/
		
		Stack<Character> stack = new Stack<>(); //stack객체 선언
		
		
		Scanner scanner = new Scanner(System.in); //입력객체선언
		System.out.print("문자열 : "); String 문자열 = scanner.next();
		
		 
		for( int i = 0 ; i<문자열.length() ; i++ ) {
			stack.push( 문자열.charAt(i) );// 문자열.charAt( 인덱스 ) : 문자열내에있는 i번제 인덱스를 빼와저장
			// stack.puth( 문자 ) : 해당 문자 저장  
		}
		
		// 3. 꺼내기 [ 문자 개수만큼 POP ]
		for( int i = 0 ; i<문자열.length() ;i++ ) {
			System.out.print( stack.pop() );
		}/*stack.pop() 해당문자를내보낸다*/
	
		
	}
}
