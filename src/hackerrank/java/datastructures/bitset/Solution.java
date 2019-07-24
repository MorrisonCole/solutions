package hackerrank.java.datastructures.bitset;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitSetLength = scanner.nextInt();
        int operationCount = scanner.nextInt();

        BitSet b1 = new BitSet(bitSetLength);
        BitSet b2 = new BitSet(bitSetLength);

        HashMap<Integer, BitSet> bitSetMap = new HashMap<Integer, BitSet>() {
            {
                put(1, b1);
                put(2, b2);
            }
        };

        for (int i = 0; i < operationCount; i++) {
            String operation = scanner.next();
            int arg1 = scanner.nextInt();
            int arg2 = scanner.nextInt();
            BitSet targetBitSet = bitSetMap.get(arg1);
            BitSet applyBitSet = bitSetMap.get(arg2);
            switch (operation) {
                case "AND":
                    targetBitSet.and(applyBitSet);
                    break;
                case "OR":
                    targetBitSet.or(applyBitSet);
                    break;
                case "XOR":
                    targetBitSet.xor(applyBitSet);
                    break;
                case "FLIP":
                    targetBitSet.flip(arg2);
                    break;
                case "SET":
                    targetBitSet.set(arg2);
                    break;
            }

            System.out.printf("%d %d%n", b1.cardinality(), b2.cardinality());
        }
    }
}
