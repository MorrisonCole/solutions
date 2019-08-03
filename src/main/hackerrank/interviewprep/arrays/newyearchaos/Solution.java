package hackerrank.interviewprep.arrays.newyearchaos;

import java.util.Scanner;

public class Solution {

    private static void minimumBribes(int[] queue) {
        int bribes = 0;

        for (int i = 0; i < queue.length; i++) {
            int finalPosition = i + 1;
            int originalPosition = queue[i];

            if (finalPosition < originalPosition - 2) {
                System.out.println("Too chaotic");
                return;
            }

            for (int j = Math.max(0, originalPosition - 2); j < i; j++) {
                if (queue[j] > originalPosition) {
                    bribes++;
                }
            }
        }

        System.out.println(bribes);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}