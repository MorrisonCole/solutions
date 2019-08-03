package hackerrank.problemsolving.algorithms.countingvalleys;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int currentHeight = 0;
        int valleyCount = 0;

        for (int i = 0; i < n; i++) {
            char currentStep = s.charAt(i);
            int nextHeight = 0;
            if (currentStep == 'U') {
                nextHeight = currentHeight + 1;

                if (currentHeight < 0 && nextHeight >= 0) {
                    valleyCount++;
                }
                currentHeight = nextHeight;
            } else {
                nextHeight = currentHeight - 1;
            }
            currentHeight = nextHeight;
        }

        return valleyCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
