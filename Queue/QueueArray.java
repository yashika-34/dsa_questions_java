package Queue;

public class QueueArray {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue is Full");
            return;
        }

        rear++;
        arr[rear] = value;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = arr[front];
        front++;
        size--;
        return value;
    }

    public int peek() {
        if (size == 0) {
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();
        System.out.println("Removed: " + q.dequeue());
        System.out.println("Front: " + q.peek());
    }
}