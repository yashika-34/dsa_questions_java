package heaps;



import java.util.Arrays;

public class HeapSort {

    void heapify(int[] arr, int size, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, size, largest);
        }
    }

    void sort(int[] arr) {
        int n = arr.length;

        // Step 1: Build a Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Move the maximum to the end
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Restore the heap in the remaining array
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        HeapSort h = new HeapSort();

        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Before sorting: "
                + Arrays.toString(arr));

        h.sort(arr);

        System.out.println("After sorting: "
                + Arrays.toString(arr));
    }
}

