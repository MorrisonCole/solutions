package com.morrison.hacker_rank.skills.cracking_the_coding_interview.ransomnote;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> magazineWords = getMagazineWordMappings(magazine);

        for (String word : note) {
            Integer matchingMagazineWord = magazineWords.get(word);

            if (matchingMagazineWord != null && matchingMagazineWord >= 1) {
                magazineWords.replace(word, matchingMagazineWord - 1);
            } else {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    private static HashMap<String, Integer> getMagazineWordMappings(String[] magazine) {
        HashMap<String, Integer> magazineWords = new HashMap<>();

        for (String word : magazine) {
            if (!magazineWords.containsKey(word)) {
                magazineWords.put(word, 1);
            } else {
                magazineWords.put(word, magazineWords.get(word) + 1);
            }
        }

        return magazineWords;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
