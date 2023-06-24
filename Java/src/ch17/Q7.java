package ch17;

import java.util.TreeSet;

class MyData7 implements Comparable<MyData7>{
	String str;
	public MyData7(String str) {
		this.str = str;
	}
	@Override
	public int compareTo(MyData7 o) {
		if (this.str.length() < o.str.length()) {
			return -1;
		}else if(this.str.length() == o.str.length()) {
			return 0;
		}else {
			return 1;
		}
	}
	@Override
	public String toString() {
		return str;
	}
}
public class Q7 {

	public static void main(String[] args) {
		MyData7 md1 = new MyData7("자바 프로그램");
		MyData7 md2 = new MyData7("반가워");
		MyData7 md3 = new MyData7("감사합니다");
		TreeSet<MyData7> treeSet = new TreeSet<MyData7>();
		treeSet.add(md1);
		treeSet.add(md2);
		treeSet.add(md3);
		System.out.println(treeSet);
	}

}
