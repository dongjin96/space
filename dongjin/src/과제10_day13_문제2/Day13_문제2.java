package ����10_day13_����2;

import java.util.Scanner;

public class Day13_����2 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean ������� = true;// ���� �� ������ư
		boolean ��ȭ��� = true;// ��ȭ�� ������ư

		while (true) { // �������� ����
			System.out.println("1.���ǵ�� 2. ��ȭ���� >>:");  // ����
			int ch = scanner.nextInt();  // �����ι޾� ����
			if (ch == 1) {
				Thread thread = new Music(); //music Ŭ���� �� �żҵ� ������ �׸��� thread�� �����ؾ� start�� �Ҽ����� �ش�Ŭ������ thread ��ü����
				if (�������) {
					Music.musicstart(�������); //MusicŬ������ musicstart�޼ҵ带ȣ���ϴµ� ��������̶�� �μ��� ���
					thread.start(); // ��ŸƮ
					������� = false; // ���ϰ� false�ιٲ�
				} else {
					Music.musicstart(�������);
					������� = true; //���ϰ� true�ιٲ�
				}

			} else if (ch == 2) {
				Thread thread = new Movie(); // ��ȭŬ������ �޼ҵ尡���� 
				if (��ȭ���) {

					Movie.moviestart(��ȭ���); //��ȭŬ�������� ��ȭ ���� �޼ҵ带 �ҷ��� �μ��� ��ȭ������ 
					thread.start();//��ŸƮ
					��ȭ��� = false; // ���ϰ� false�ιٲ�

				} else {
					Movie.moviestart(��ȭ���);
					��ȭ��� = true; //���ϰ� true�ιٲ�
				}

			}
		}

	}
}
