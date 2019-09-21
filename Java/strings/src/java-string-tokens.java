// https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String delims = "[ !,?.\\\\_'@]+";
        String[] tokens = s.trim().split(delims);

        if(s.trim().equals("")) {
            System.out.println("0");
        } else {
            System.out.println(tokens.length);
        }

        for (String token : tokens) {
            System.out.println(token);
        }
        scan.close();
    }
}
