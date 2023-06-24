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
	 	HashSet�� ��ü�� �����ϱ� ���� ���� ��ü�� hashCode()�޼ҵ带 ȣ���ؼ�
	 	�ؽ� �ڵ带 �� ���� ����Ǿ� �ִ� ��ü���� �ؽ� �ڵ�� ���� �� ���� �ؽ� �ڵ尡 �ִٸ� 
	 	�ٽ� equals() �޼ҵ�� �� ��ü�� ���ؼ� 
	 	true�� ������ ������ ��ü�� �Ǵ��ϰ� �ߺ� ������ ���� �ʽ��ϴ�.
	 */
}
public class Q6 {

	public static void main(String[] args) {
		Set<Data6> set = new HashSet<>();
		set.add(new Data6(2));
		set.add(new Data6(2));
		set.add(new Data6(3));
		System.out.println(set.size());
		// ������ : 2
	}

}
