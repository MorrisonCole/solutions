package com.morrisoncole.solutions.hackerrank.skills.problem_solving.algorithms.repeatedstring;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        char[] characters = s.toCharArray();
        int totalCharacters = characters.length;

        int totalAs = 0;
        for (int i = 0; i < totalCharacters; i++) {
            if (characters[i] == 'a') {
                totalAs++;
            }
        }

        if (totalAs == 0) {
            return 0;
        }

        long aCount = (long) (Math.floor(n / totalCharacters) * totalAs);
        long remainder = n % totalCharacters;
        for (int i = 0; i < remainder; i++) {
            if (characters[i] == 'a') {
                aCount++;
            }
        }

        return aCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
