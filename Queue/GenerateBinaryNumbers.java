package Queue;
import java.util.*;

public class GenerateBinaryNumbers {

    public static void generateBinary(int n) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("1");

        for (int i = 1; i <= n; i++) {
            String current = queue.poll();

            System.out.print(current + " ");

            queue.offer(current + "0");
            queue.offer(current + "1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        generateBinary(n);

        sc.close();
    }
}
