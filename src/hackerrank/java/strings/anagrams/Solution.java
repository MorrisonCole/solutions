package hackerrank.java.strings.anagrams;

import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        Map bMap = new HashMap<Character, Integer>();

        for (int i = 0; i < b.length(); i++) {
            Character thisCharacter = b.toLowerCase().charAt(i);
            if (!bMap.containsKey(thisCharacter)) {
                bMap.put(thisCharacter, 1);
            } else {
                bMap.replace(thisCharacter, (Integer) bMap.get(thisCharacter) + 1);
            }
        }

        for (int i = 0; i < a.length(); i++) {
            Character thisCharacter = a.toLowerCase().charAt(i);
            if (bMap.containsKey(thisCharacter)) {
                Integer charactersRemaining = (Integer) bMap.get(thisCharacter);
                if (charactersRemaining == 1) {
                    bMap.remove(thisCharacter);
                } else {
                    bMap.replace(thisCharacter, charactersRemaining - 1);
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}