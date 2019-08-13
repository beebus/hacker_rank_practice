// https://www.hackerrank.com/challenges/java-loops/problem

import java.util.*;

class Solution {
    public static void main(String []argh) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();        // get first line, denoting the number of queries
        for(int i = 0; i < q; i++) {    // outer loop gets each remaining line's a, b, and c
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            for(int j = 0; j < n; j++) {    // inner loop outputs ints based on value of n
                a += b;
                System.out.print(a + " ");
                b *= 2;
            }
            System.out.println();
        }
        // close the scanner
        input.close();
    }
}