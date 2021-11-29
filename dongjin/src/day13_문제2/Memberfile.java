package day13_문제2;

import java.util.Scanner;

public class Memberfile {

	
	
	
	
	public static Scanner scanner = new Scanner(System.in);// 다른 클래스에서도 사용할수있게
	
	public static Member[] members = new Member[100];
	
	
			public static void main(String[] args) {
				while(true) {
					Member temp = new Member();
					temp.signup();
				}
			}
			}
