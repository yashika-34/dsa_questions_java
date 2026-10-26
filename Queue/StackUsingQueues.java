package Queue;
import java.util.*;

public class StackUsingQueues {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int x) {
        q2.offer(x);

        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    int pop() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.poll();
    }

    int top() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.peek();
    }

    boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop()); // 30
        System.out.println(stack.top()); // 20
        System.out.println(stack.pop()); // 20
        System.out.println(stack.pop()); // 10
        System.out.println(stack.pop()); // -1
    }
}