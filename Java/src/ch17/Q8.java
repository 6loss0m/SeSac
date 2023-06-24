package ch17;

import java.util.HashMap;
import java.util.Map;

public class Q8 {

	public static void main(String[] args) {
		Map<String, Boolean> map = new HashMap<>();
		map.put("사운드", true);
		map.put("그래픽", false);
		map.put("배경음", true);
		map.put("그래픽", true);
		System.out.println(map);
		/*	출력 결과
		 	{배경음=true, 사운드=true, 그래픽=true}
		 */
	}

}
