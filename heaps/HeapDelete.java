package heaps;





import java.util.ArrayList;

public class HeapDelete {
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

    void deleteRoot() {
        if (heap.isEmpty()) {
            System.out.println("Heap is empty");
            return;
        }

        int deleted = heap.get(0);
        int last = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapifyDown(0);
        }

        System.out.println("Deleted root: " + deleted);
    }

    void heapifyDown(int i) {
        int size = heap.size();

        while (true) {
            int largest = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < size &&
                heap.get(left) > heap.get(largest)) {
                largest = left;
            }

            if (right < size &&
                heap.get(right) > heap.get(largest)) {
                largest = right;
            }

            if (largest == i) {
                break;
            }

            int temp = heap.get(i);
            heap.set(i, heap.get(largest));
            heap.set(largest, temp);

            i = largest;
        }
    }

    public static void main(String[] args) {
        HeapDelete h = new HeapDelete();

        h.insert(90);
        h.insert(80);
        h.insert(20);
        h.insert(10);
        h.insert(60);

        System.out.println("Before deletion: " + h.heap);

        h.deleteRoot();

        System.out.println("After deletion: " + h.heap);
    }
}

