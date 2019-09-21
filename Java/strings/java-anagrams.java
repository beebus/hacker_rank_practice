// https://www.hackerrank.com/challenges/java-anagrams/problem

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if ((a == null || b == null) || (a.length() != b.length())) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        int [] ascii_index = new int [Character.MAX_VALUE];
        //sry, too lazy to calculate ASCII idx of a-z rel. i :)

        int sum = 0;

        for (int i = 0; i < a.length(); i++){
            sum += ++ascii_index [a.charAt(i)] <= 0 ? -1 : 1;
            sum += --ascii_index [b.charAt(i)] >= 0 ? -1 : 1;
        }

        return sum == 0;

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
