package ch17;

import java.util.HashMap;
import java.util.Map;

public class Q8 {

	public static void main(String[] args) {
		Map<String, Boolean> map = new HashMap<>();
		map.put("����", true);
		map.put("�׷���", false);
		map.put("�����", true);
		map.put("�׷���", true);
		System.out.println(map);
		/*	��� ���
		 	{�����=true, ����=true, �׷���=true}
		 */
	}

}
