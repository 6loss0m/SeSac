package ch17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Q4 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		// LinkedList�� �¿� �����Ϳ��� ������������ �����ϱ� ������ �������� �߰� ���� �ӵ��� �ٸ� List ����Ŭ�������� ����
		for(int i=0; i<100000;i++) {
			list.add(0, i+ "������");
		}
		System.out.println("�Ϸ�");
	}
}
