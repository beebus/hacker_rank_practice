// https://www.hackerrank.com/challenges/phone-book/problem

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   // names in the phone book
        in.nextLine();
        HashMap<String, Integer> phonebook = new HashMap<>();

        for (int i = 0; i < n; i++)  // fill phone book map
        {
            String name = in.nextLine();
            int phone = in.nextInt();
            phonebook.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext())     // every query which are the rest of the inputs
        {
            String s = in.nextLine();
            if (phonebook.containsKey(s))   // if exists
                System.out.println(s + "=" + phonebook.get(s));
            else
                System.out.println("Not found");
        }
    }
}



