package ����15;

import java.util.HashSet;
import java.util.Scanner;


public class set {

	
	
	
	
		public static void main(String[] args) {
			HashSet<String> set = new HashSet<String>();
			Scanner scanner = new Scanner(System.in);
			  set.add("apple");
		        set.add("banana");
		        set.add("pyopyo");
		        set.add("kiwi");

		        while(true) {
		        	System.out.println("1�迭���� 2.���� 3. ����������");
		        	int ch = scanner.nextInt();
		        	if (ch==1) {
		        		System.out.println(set.size()); //�迭���ִ��
					}
		        	if (ch==2) {
						set.clear();
						System.out.println(set.toString());  // [] ���ε���
					}
		        	if(ch==3) {
		        		 System.out.println(set.contains("apple")); // ���������ϱ�true
		        	        System.out.println(set.contains("hi")); //Hi�����ϱ� false


		        	
						
		        		
		        	}
		        }
		        
		}
}
