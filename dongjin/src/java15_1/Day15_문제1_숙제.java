package java15_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Day15_����1_���� {
	
	
	
	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in); // scanner�Է°�ü ���� 
		ArrayList<Integer>arrayList = new ArrayList<Integer>();//
		/*integer �� int �� ����Ŭ���� ����Ҽ�����
		 * ����ҋ���
		 *  �Ű������� ��ü�� �ʿ���ҋ� �̴�
		 *  �Űܺ����� �Լ��� ȣ��ɶ� �μ��� ���޵Ȱ��� �Լ����ο��� ����Ҽ��ְ����ִ� ����!!
		 * */
		while(true){
				
			System.out.println("------------�����Ȳ-----------");
			for (int i = 0; i < arrayList.size(); i++) {// arraylist�� .size������
				System.out.println(i+1+":����ܼ���"+arrayList.get(i)+"�ο���"); // i�� 0���� �����̴ϱ� 1 +���༭ ���� get(i)�� ����߰����� �Է¹������� +"�ο����� ����"
			}
			///////////////////////////////////////////////////////////////////
			System.out.println("1.����߰� 2.������3.[������]�������");
			int ch =scanner.nextInt();
			if(ch==1) {
				System.out.println("�ο��� :"); int count = scanner.nextInt();//1����߰��ϱ� �ο������޾����Ѵ�
				arrayList.add(count);	// �Է¹��� �ο����� .add�����ؼ�list���ִ´�
				System.out.println("������ ����ȣ:"+arrayList.size());// arraylsit.size()�� �߰��Ѹ�ŭ �迭�� �����°Ŵϱ� ����ȣ�� �̰ɷ��ϴ°Ը´�
				
			}
			else if(ch==2) {
			System.out.println(" ����� ��ܹ�ȣ :"); int count1 = scanner.nextInt(); //����Ԥ���
			arrayList.remove(count1-1); //����ȣ�� 1�����̰�//�ε����� 0���Ͷ� .reamove����°ɾ���
			System.out.println("��ҵǾ����ϴ�");
			}
			else if (ch==3) {
				if (arrayList.isEmpty()) {
					System.out.println("������� ���̾����ϴ�");
					
				}else {
					System.out.println("�����մϴ�");
					arrayList.remove(0); // �ε����� ����Ȱ� 0���ʹ±� 0����remove
				}
				
			}
			
		}	
		
	}
	
	
	

}
