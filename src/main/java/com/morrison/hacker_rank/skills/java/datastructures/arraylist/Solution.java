package com.morrison.hacker_rank.skills.java.datastructures.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineCount = scanner.nextInt();

        ArrayList[] x = new ArrayList[lineCount];
        for (int i = 0; i < lineCount; i++) {
            int integersInLine = scanner.nextInt();

            ArrayList<Integer> y = new ArrayList<>();
            for (int j = 0; j < integersInLine; j++) {
                y.add(scanner.nextInt());
            }
            x[i] = y;
        }

        int queryCount = scanner.nextInt();

        for (int i = 0; i < queryCount; i++) {
            int queryX = scanner.nextInt() - 1;
            int queryY = scanner.nextInt() - 1;

            ArrayList yRow = x[queryX];
            if (queryY >= yRow.size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(yRow.get(queryY));
            }
        }
    }
}
