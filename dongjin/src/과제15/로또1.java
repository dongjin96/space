package ����15;

import java.util.HashSet;
import java.util.Scanner;

public class �ζ�1 {

		public static void main(String[] args) {
			HashSet<Integer>set = new HashSet<>();
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
				System.out.println("1~45���� ���ڸ� �������ּ���~! :");
				int num = scanner.nextInt();
				if(num<1||num>45) {
					System.out.println("�����Ҽ����¼��Դϴ�");
				}else {
					 if (set.contains(num)) {
						System.out.println("�ߺ��ȼ��Դϴ�");
					}else {
						set.add(num);
						System.out.println("Ȯ��"+set);
					}
				}
				if (set.size()==6) {
					
				}break;
			}
		}
	
	
	
}
