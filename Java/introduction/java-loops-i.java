// https://www.hackerrank.com/challenges/java-loops-i/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d%n", n, i, n*i);
        }
    }
}
