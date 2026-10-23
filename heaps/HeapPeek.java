package heaps;





import java.util.ArrayList;

public class HeapPeek {
    ArrayList<Integer> heap = new ArrayList<>();

    void insert(int value) {
        heap.add(value);
        int i = heap.size() - 1;

        while (i > 0) {
            int parent = (i - 1) / 2;

            if (heap.get(parent) < heap.get(i)) {
                int temp = heap.get(parent);
                heap.set(parent, heap.get(i));
                heap.set(i, temp);
                i = parent;
            } else {
                break;
            }
        }
    }

    Integer peek() {
        if (heap.isEmpty()) {
            System.out.println("Heap is empty");
            return null;
        }

        return heap.get(0);
    }

    public static void main(String[] args) {
        HeapPeek h = new HeapPeek();

        h.insert(40);
        h.insert(90);
        h.insert(30);
        h.insert(70);

        System.out.println("Heap: " + h.heap);
        System.out.println("Maximum element: " + h.peek());
        System.out.println("Heap after peek: " + h.heap);
    }
}
