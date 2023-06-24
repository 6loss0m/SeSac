package ch17;

import java.util.LinkedList;
import java.util.Queue;

public class Q10 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("땡큐");
		queue.offer("베리");
		queue.offer("감사");
		queue.poll();
		queue.offer("방가");
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		/*	출력 결과
		 	베리
		 	베리
		 	감사
		 	방가
		 */

	}

}
