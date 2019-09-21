// https://www.hackerrank.com/challenges/java-strings-introduction/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        // There are three lines of output:
        // For the first line, sum the lengths of A and B.
        System.out.println(A.length()+B.length());

        // For the second line, write "Yes" if A is lexicographically greater than B otherwise print "No" instead.
        System.out.println(A.compareTo(B)>0?"Yes":"No");

        // For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));
    }
}
