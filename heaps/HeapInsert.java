
package heaps;
import java.util.ArrayList;



public class HeapInsert {
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

    void display() {
        System.out.println(heap);
    }

    public static void main(String[] args) {
        HeapInsert h = new HeapInsert();

        h.insert(50);
        h.insert(30);
        h.insert(70);
        h.insert(20);
        h.insert(60);

        h.display();
    }
}
