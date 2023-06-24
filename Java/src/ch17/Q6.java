package ch17;

import java.util.HashSet;
import java.util.Set;

class Data6{
	int m;
	public Data6(int m) {
		this.m = m;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Data6)
			return this.m == ((Data6)obj).m;
		else
			return false;
	}
	@Override
	public int hashCode() {
		return m;
		// return obejcts.hash(m);
		// Integer(m).hashCode();
	}
	/*
	 	HashSet은 객체를 저장하기 전에 먼저 객체의 hashCode()메소드를 호출해서
	 	해시 코드를 얻어낸 다음 저장되어 있는 객체들의 해시 코드와 비교한 뒤 같은 해시 코드가 있다면 
	 	다시 equals() 메소드로 두 객체를 비교해서 
	 	true가 나오면 동일한 객체로 판단하고 중복 저장을 하지 않습니다.
	 */
}
public class Q6 {

	public static void main(String[] args) {
		Set<Data6> set = new HashSet<>();
		set.add(new Data6(2));
		set.add(new Data6(2));
		set.add(new Data6(3));
		System.out.println(set.size());
		// 실행결과 : 2
	}

}
