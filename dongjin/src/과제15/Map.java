package ����15;

import java.util.HashMap;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("people", "���");
        map.put("baseball", "�߱�");
        map.put("soccer", "���");

        System.out.println(map.get("people")); // get �� �Է��ϸ� ���� �������ִ�  �׷���  Ű people�� �������� ����� ��µȴ�
        System.out.println(map.get("baseball")); //���̽� �� �� �Է����� �߱� �������°ɾ˼��ִ�
        System.out.println(map.containsKey("people")); // ����� �Է����� ture����
        System.out.println(map.remove("people")); // people �� ��������� ����� ���´�
        System.out.println(map.size());// �ϳ��� �����Ǿ����Ƿ� 2���� �������
    }
    }