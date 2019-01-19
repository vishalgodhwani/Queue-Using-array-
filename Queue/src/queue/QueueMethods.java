package queue;

public class QueueMethods {
	int queue[] = new int[5];
	int size=0,rear=0,front=0,maxsize=5;
	
	public void enQueue(int element) {
		if(size!=maxsize) {
			queue[rear++] = element;
			size++;
		}
		else {
			System.out.println("Queue is full , cannot add "+element);
		}
	}
	
	public void deQueue() {
		if(front!=rear) {
			System.out.println(queue[front++]);
			size--;
		}
		else {
			System.out.println("Queue is empty");
			rear = 0;
			front =0;
		}
	}
	
	public void show() {
		System.out.print("Elements of the queue are : ");
		if(front!=rear) {
			for(int i=0;i<size;i++) {
				System.out.print(queue[i]+" ");
			}
		}
		else {
			System.out.println("Queue is empty");
			rear = 0;
			front =0;
		}
		System.out.println();
	}
	
	public boolean isEmpty() {
		if(front!=rear) {
			return false;
		}
		else {
			return true;
		}
	}
}
