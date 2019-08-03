package com.morrison.hacker_rank.skills.java.strings.substringcomparisons;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest hackerrank.substring of length 'k'
        // 'largest' must be the lexicographically largest hackerrank.substring of length 'k'
        smallest = compareStrings(s, k, true);
        largest = compareStrings(s, k, false);

        return smallest + "\n" + largest;
    }

    private static String compareStrings(String s, int k, boolean smallest) {
        return compareStrings(s, k, 0, smallest);
    }

    private static String compareStrings(String s, int k, int fromIndex, boolean smallest) {
        String thisSubstring = s.substring(fromIndex, fromIndex + k);

        if (s.length() <= fromIndex + k) {
            return thisSubstring;
        }

        String nextSubstring = compareStrings(s, k, fromIndex + 1, smallest);
        if (thisSubstring.compareTo(nextSubstring) <= 0)
        {
            return smallest ? thisSubstring : nextSubstring;
        } else {
            return smallest ? nextSubstring : thisSubstring;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}