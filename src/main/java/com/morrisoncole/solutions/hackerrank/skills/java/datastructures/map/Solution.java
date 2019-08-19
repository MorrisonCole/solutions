package com.morrisoncole.solutions.hackerrank.skills.java.datastructures.map;

import java.util.HashMap;
        import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        HashMap<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();

            phoneBook.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();

            Integer phoneNumber = phoneBook.get(s);
            if (phoneNumber != null) {
                System.out.printf("%s=%d%n", s, phoneNumber);
            } else {
                System.out.println("Not found");
            }
        }
    }
}
