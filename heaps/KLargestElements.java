package heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class KLargestElements {

    /**
     * Finds the K largest elements in an array using a Min Heap of size K.
     * Time Complexity: O(N log K)
     * Space Complexity: O(K)
     */
    public static List<Integer> findKLargest(int[] arr, int k) {
        // Min Heap to maintain the K largest elements seen so far
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.add(num);

            // If heap size exceeds K, remove the smallest element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Extract remaining elements (the K largest)
        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll());
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 50, 23, 90, 60};
        int k = 3;

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("K = " + k);

        List<Integer> kLargest = findKLargest(arr, k);
        System.out.println("K Largest Elements: " + kLargest);
    }
}
