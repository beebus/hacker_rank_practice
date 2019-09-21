// https://www.hackerrank.com/challenges/java-bitset/problem

import java.io.*;
import java.util.*;
import java.util.function.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();   // length
        int m = in.nextInt();   // num of operations

        BitSet[] bitSets = new BitSet[] {new BitSet(n), new BitSet(n)};
        Map<String, BiConsumer<Integer, Integer>> ops = new HashMap<>();
        ops.put("AND", (index1, index2) -> bitSets[index1-1].and(bitSets[index2-1]));
        ops.put("OR", (index1, index2) -> bitSets[index1-1].or(bitSets[index2-1]));
        ops.put("XOR", (index1, index2) -> bitSets[index1-1].xor(bitSets[index2-1]));
        ops.put("SET", (index1, index2) -> bitSets[index1-1].set(index2));
        ops.put("FLIP", (index1, index2) -> bitSets[index1-1].flip(index2));
        for (int i = 0; i < m; i++) {
            ops.get(in.next()).accept(in.nextInt(), in.nextInt());
            System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality());
        }
    }
}

