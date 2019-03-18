-- NOT COMPLETE
-- https://www.hackerrank.com/challenges/java-output-formatting/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            for(int i = 0; i < 3; i++)
            {
                String s1 = sc.next();
                int x = sc.nextInt();
                
                String s2 = Integer.toString(x);
                System.out.printf("%15s", s1);
                System.out.printf("%15s", x + " \n");

            }
            System.out.println("================================");

    }
}


