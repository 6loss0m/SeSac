package ch17;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Q3 {

	public static void main(String[] args) {
		List<Boolean> list = new Vector<>();
		list.add(true);
		list.add(false);
		list.add(true);
		// List.toArray : List �����̳��� �ν��Ͻ��� �迭(array)�� ����°�
		Boolean[] bArray = list.toArray(new Boolean[5]);
		System.out.println(Arrays.toString(bArray));
		/*	���� ���
		 	[true, false, true, null, null]
		 */

	}

}
