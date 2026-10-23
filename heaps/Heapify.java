package heaps;



import java.util.Arrays;

public class Heapify {

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

    public static void main(String[] args) {
        Heapify h = new Heapify();

        int[] arr = {10, 40, 30, 20, 35};

        System.out.println("Before heapify: "
                + Arrays.toString(arr));

        h.heapify(arr, arr.length, 0);

        System.out.println("After heapify: "
                + Arrays.toString(arr));
    }
}
