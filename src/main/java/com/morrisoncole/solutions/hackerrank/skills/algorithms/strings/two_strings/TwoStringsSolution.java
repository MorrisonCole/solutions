package com.morrisoncole.solutions.hackerrank.skills.algorithms.strings.two_strings;

import java.util.HashSet;

public class TwoStringsSolution {

    public String containsSubstring(String stringOne, String stringTwo) {
        HashSet<Character> charactersInStringOne = new HashSet<>();
        for (int i = 0; i < stringOne.length(); i++) {
            charactersInStringOne.add(stringOne.charAt(i));
        }

        for (int i = 0; i < stringTwo.length(); i++) {
            if (charactersInStringOne.contains(stringTwo.charAt(i))) {
                return "YES";
            }
        }

        return "NO";
    }
}
