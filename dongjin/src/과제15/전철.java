package 과제15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 전철 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<String>종점역 = new LinkedList<String>();
		Queue<String>용산역 = new LinkedList<String>();
		Queue<String>서울역 = new LinkedList<String>();
		Queue<String>구로역 = new LinkedList<String>();
		
		종점역.offer("1번전철");
		종점역.offer("2번전철");
		종점역.offer("3번전철");
		
		 	while(true) {
		 		System.out.println(종점역);
		 		System.out.println(용산역);
		 		System.out.println(서울역);
		 		System.out.println(구로역);
		 		System.out.println("1.종점 2.용산 3.서울 4.구로 :");
		 		int ch = scanner.nextInt();
		 		if (ch==1) {
					System.out.println(종점역);
					if (!종점역.isEmpty()) {
						Thread.sleep(2000);
						System.out.println("출발 :"+종점역.peek());
						용산역.offer(종점역.poll());
					}
				}
		 		if (ch==2) {
					System.out.println(용산역);
					if (!용산역.isEmpty()) {
						Thread.sleep(2000);
						System.out.println("출발 :"+용산역.peek());
						서울역.offer(용산역.poll());
					}
				}
		 		if (ch==3) {
					System.out.println(서울역);
					if (!서울역.isEmpty()) {
						Thread.sleep(2000);
						System.out.println("출발 :"+서울역.peek());
						서울역.offer(용산역.poll());
					}
				}
		 		if (ch==4) {
					System.out.println(구로역);
					if (!구로역.isEmpty()) {
						Thread.sleep(2000);
						System.out.println("출발 :"+구로역.peek());
						구로역.offer(구로역.poll());
					}
				}
		 	}
	}
	
}
