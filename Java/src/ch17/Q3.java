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
		// List.toArray : List 컨테이너의 인스턴스를 배열(array)로 만드는것
		Boolean[] bArray = list.toArray(new Boolean[5]);
		System.out.println(Arrays.toString(bArray));
		/*	실행 결과
		 	[true, false, true, null, null]
		 */

	}

}
