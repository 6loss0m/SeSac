package ch17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Q4 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		// LinkedList는 좌우 데이터와의 연결정보만을 저장하기 때문에 데이터의 추가 삭제 속도가 다른 List 구현클래스보다 빠름
		for(int i=0; i<100000;i++) {
			list.add(0, i+ "데이터");
		}
		System.out.println("완료");
	}
}
