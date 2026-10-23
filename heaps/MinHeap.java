
package heaps;

import java.util.*;


public class MinHeap {

    ArrayList<Integer> heap = new ArrayList<>();

    // Insert an element
    void insert(int value) {
        heap.add(value);
        int i = heap.size() - 1;

        // Heapify up
        while (i > 0) {
            int parent = (i - 1) / 2;

            if (heap.get(i) < heap.get(parent)) {
                int temp = heap.get(i);
                heap.set(i, heap.get(parent));
                heap.set(parent, temp);

                i = parent;
            } else {
                break;
            }
        }
    }

    // Return the minimum element
    int peek() {
        if (heap.isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }

        return heap.get(0);
    }

    // Restore Min Heap property downward
    void heapifyDown(int i) {
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;

            if (left < heap.size()
                    && heap.get(left) < heap.get(smallest)) {
                smallest = left;
            }

            if (right < heap.size()
                    && heap.get(right) < heap.get(smallest)) {
                smallest = right;
            }

            if (smallest == i) {
                break;
            }

            int temp = heap.get(i);
            heap.set(i, heap.get(smallest));
            heap.set(smallest, temp);

            i = smallest;
        }
    }

    // Delete and return the root
    int deleteRoot() {
        if (heap.isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }

        int min = heap.get(0);
        int last = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapifyDown(0);
        }

        return min;
    }

    // Display the heap
    void display() {
        System.out.println(heap);
    }

    // Check whether heap is empty
    boolean isEmpty() {
        return heap.isEmpty();
    }

    // Return the number of elements
    int size() {
        return heap.size();
    }

    public static void main(String[] args) {
        MinHeap h = new MinHeap();

        h.insert(10);
        h.insert(90);
        h.insert(70);
        h.insert(20);
        h.insert(100);

        System.out.print("Min Heap: ");
        h.display();

        System.out.println("Minimum: " + h.peek());

        System.out.println("Deleted root: " + h.deleteRoot());

        System.out.print("After deletion: ");
        h.display();
    }
}
