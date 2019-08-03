package hackerrank.java.datastructures.dequeue;

import java.util.*;

public class test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        int max = Integer.MIN_VALUE;
        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            seenNumbers.add(num);

            if (deque.size() == m) {
                max = Math.max(max, seenNumbers.size());

                Integer dequed = deque.pollFirst();
                if (!deque.contains(dequed)) {
                    seenNumbers.remove(dequed);
                }
            }
        }

        System.out.println(max);
    }
}
