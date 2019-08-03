package hackerrank.java.advanced.sha256;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input = scanner.next();
        scanner.close();

        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(input.getBytes());

            byte[] output = messageDigest.digest();
            for (byte b : output) {
                System.out.printf("%02x", b);
            }
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Couldn't find algorithm " + e.getMessage());
        }
    }
}
