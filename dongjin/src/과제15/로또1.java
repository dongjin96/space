package 과제15;

import java.util.HashSet;
import java.util.Scanner;

public class 로또1 {

		public static void main(String[] args) {
			HashSet<Integer>set = new HashSet<>();
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
				System.out.println("1~45개의 숫자를 선택해주세요~! :");
				int num = scanner.nextInt();
				if(num<1||num>45) {
					System.out.println("선택할수없는수입니다");
				}else {
					 if (set.contains(num)) {
						System.out.println("중복된수입니다");
					}else {
						set.add(num);
						System.out.println("확인"+set);
					}
				}
				if (set.size()==6) {
					
				}break;
			}
		}
	
	
	
}
