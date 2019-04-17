// https://www.hackerrank.com/challenges/java-stdin-stdout/
import java.util.Scanner;   // Import the Scanner class

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        int i = scan.nextInt();         // reads an integer from user
        double d = scan.nextDouble();   // read a double from user
        scan.nextLine();        // get rid of the /n end of line character
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        // close the scanner
        scan.close();
    }
}

