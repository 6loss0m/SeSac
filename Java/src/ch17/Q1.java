package ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1);
		// Arrays.asList() : �Ϲ� �迭�� ArrayList�� ��ȯ�Ѵ�.
		// �߰� ����� ����
		List<Integer> list2 = Arrays.asList(1, 2);
		list2.add(3); //���� �߻�
		System.out.println(list2);
	}

}
