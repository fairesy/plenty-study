package dataStructure;

public class ArrayQueue {
	private int front;
	private int rear;
	private int capacity;
	private int[] array;

	// 가장 처음에는 front, rear 모두 -1을 가리켜서 큐가 비어있다는 것을 나타낸다.
	private ArrayQueue(int size) {
		capacity = size;
		front = -1;
		rear = -1;
		array = new int[size];
	}

	public static ArrayQueue createQueue(int size) {
		return new ArrayQueue(size);
	}

	public boolean isEmpty() {
		return (front == -1);
	}

	public boolean isFull() {
		return ((rear + 1) % capacity == front);
	}

	public int getQueueSize() {
		return ((capacity - front + rear + 1) % capacity);
	}

	public void enQueue(int data) throws Exception {
		if (isFull()) {
			throw new Exception("Queue Overflow");
		} else {
			rear = (rear + 1) % capacity;
			array[rear] = data;
			if (front == -1) {
				front = rear;
			}
		}
	}

	public int deQueue() throws Exception {
		int data = 0;
		if (isEmpty()) {
			throw new Exception("Queue underflow");
		} else {
			data = array[front];
			if (front == rear) {
				front = rear - 1;
			} else {
				front = (front + 1) % capacity;
			}
		}
		return data;
	}
}
