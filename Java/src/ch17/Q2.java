package ch17;

import java.util.ArrayList;
import java.util.List;

public class Q2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		list.remove(2); // 2�� index ��� ����
		System.out.println(list);
		/*	���� ���
		 	[2, 3, 4]
		 	[2, 3]
		 */
	}
}
