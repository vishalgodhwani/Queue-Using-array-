//Queue implementation using array.
package main;
import queue.QueueMethods;

public class Runner {

	public static void main(String[] args) {
		QueueMethods q = new QueueMethods();
		q.deQueue();
		q.show();
		q.enQueue(5);
		q.enQueue(5);
		q.enQueue(5);
		q.enQueue(5);
		q.enQueue(5);
		q.enQueue(5);
		q.show();
	}
}
