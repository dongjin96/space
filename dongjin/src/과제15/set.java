package 과제15;

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
		        	System.out.println("1배열길이 2.삭제 3. 값포함유무");
		        	int ch = scanner.nextInt();
		        	if (ch==1) {
		        		System.out.println(set.size()); //배열수최대수
					}
		        	if (ch==2) {
						set.clear();
						System.out.println(set.toString());  // [] 빈인덱스
					}
		        	if(ch==3) {
		        		 System.out.println(set.contains("apple")); // 애플있으니깐true
		        	        System.out.println(set.contains("hi")); //Hi없으니깐 false


		        	
						
		        		
		        	}
		        }
		        
		}
}
