package heaps;

import java.util.ArrayList;
import java.util.Arrays;

public class BuildHeap {
    ArrayList<Integer> heap = new ArrayList<>();

    void buildHeap(int[] arr) {
        heap.clear();

        for (int value : arr) {
            heap.add(value);
        }

        int lastParent = heap.size() / 2 - 1;

        for (int i = lastParent; i >= 0; i--) {
            heapifyDown(i);
        }
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
        BuildHeap h = new BuildHeap();

        int[] arr = {10, 20, 15, 30, 40};

        System.out.println("Original array: "
                + Arrays.toString(arr));

        h.buildHeap(arr);

        System.out.println("Max Heap: " + h.heap);
    }
}
