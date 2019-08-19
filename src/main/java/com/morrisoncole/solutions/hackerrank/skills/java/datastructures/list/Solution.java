package com.morrisoncole.solutions.hackerrank.skills.java.datastructures.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int listLength = scanner.nextInt();

        ArrayList<Integer> input = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            input.add(scanner.nextInt());
        }

        int queryCount = scanner.nextInt();

        for (int i = 0; i < queryCount; i++) {
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String query = scanner.nextLine();

            switch (query) {
                case "Insert":
                    int insertIndex = scanner.nextInt();
                    int insertNumber = scanner.nextInt();
                    input.add(insertIndex, insertNumber);
                    break;
                case "Delete":
                    int deleteIndex = scanner.nextInt();
                    input.remove(deleteIndex);
                    break;
            }
        }

        System.out.println(input.toString().replaceAll("[\\[\\],]", ""));
    }
}

