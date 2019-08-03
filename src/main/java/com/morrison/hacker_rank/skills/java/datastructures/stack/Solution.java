package com.morrison.hacker_rank.skills.java.datastructures.stack;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Character, Character> characterMap = new HashMap<Character, Character>() {
            {
                put('(', ')');
                put('{', '}');
                put('[', ']');
            }
        };

        while (sc.hasNext()) {
            String input = sc.next();

            System.out.println(isBalanced(characterMap, input));
        }
    }

    private static boolean isBalanced(HashMap<Character, Character> characterMap, String input) {
        if (input.isEmpty()) {
            return true;
        } else if (input.length() % 2 != 0) {
            return false;
        }

        ArrayDeque<Character> characters = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (characterMap.containsKey(character)) {
                characters.push(character);
            } else if (characters.isEmpty() || characterMap.get(characters.pop()) != character) {
                return false;
            }
        }

        return characters.isEmpty();
    }
}
