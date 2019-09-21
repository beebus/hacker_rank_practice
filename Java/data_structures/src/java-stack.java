// https://www.hackerrank.com/challenges/java-stack/problem

import java.util.*;

class Solution {

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String input = in.next();
            //Complete the code
            Stack<Character> charStack = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                if (!charStack.isEmpty()) {
                    switch (input.charAt(i)) {
                        case '}':
                            if (charStack.peek() == '{') {
                                charStack.pop();
                            }
                            break;
                        case ']':
                            if (charStack.peek() == '[') {
                                charStack.pop();
                            }
                            break;
                        case ')':
                            if (charStack.peek() == '(') {
                                charStack.pop();
                            }
                            break;
                        default:
                            charStack.push(input.charAt(i));
                    }
                } else {
                    charStack.push(input.charAt(i));
                }
            }
            System.out.println(charStack.isEmpty());
        }

    }
}