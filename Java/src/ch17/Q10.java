package ch17;

import java.util.LinkedList;
import java.util.Queue;

public class Q10 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("��ť");
		queue.offer("����");
		queue.offer("����");
		queue.poll();
		queue.offer("�氡");
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		/*	��� ���
		 	����
		 	����
		 	����
		 	�氡
		 */

	}

}
