package ����14;

import java.util.Scanner;
import java.util.Stack;

public class �������̱� {

	
	
	public static void main(String[] args) {
		/*stack ��
		  �Է¹޾Ƽ� �����̵Ǹ� �� ������ ���� ������ ����ȴ� (������:statck.push)* �׸��� �������Ë��� ���߿��������κ��������Եȴ� Stack.Pop�̴�*/
		
		Stack<Character> stack = new Stack<>(); //stack��ü ����
		
		
		Scanner scanner = new Scanner(System.in); //�Է°�ü����
		System.out.print("���ڿ� : "); String ���ڿ� = scanner.next();
		
		 
		for( int i = 0 ; i<���ڿ�.length() ; i++ ) {
			stack.push( ���ڿ�.charAt(i) );// ���ڿ�.charAt( �ε��� ) : ���ڿ������ִ� i���� �ε����� ��������
			// stack.puth( ���� ) : �ش� ���� ����  
		}
		
		// 3. ������ [ ���� ������ŭ POP ]
		for( int i = 0 ; i<���ڿ�.length() ;i++ ) {
			System.out.print( stack.pop() );
		}/*stack.pop() �ش繮�ڸ���������*/
	
		
	}
}
