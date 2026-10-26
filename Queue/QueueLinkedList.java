package Queue;

class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueLinkedList {
    private QueueNode front;
    private QueueNode rear;

    public void enqueue(int data) {
        QueueNode node = new QueueNode(data);

        if (rear == null) {
            front = rear = node;
            return;
        }

        rear.next = node;
        rear = node;
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return value;
    }

    public int peek() {
        if (front == null) {
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display() {
        QueueNode temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();
        System.out.println("Removed: " + q.dequeue());
        System.out.println("Front: " + q.peek());
    }
}