package stack;

import java.util.Stack;

public class BracketsMatching {
    public static void main(String[] args) {

        String pattern = "[{}{}][{";
        Stack<Character> stack = new Stack();
        boolean matched = true;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else {
                char popped = stack.pop();
                if( (c == '[' && popped !=']') || (c == ']' && popped !='[')){
                    matched=false;
                    break;
                }
                if((c == '{' && popped !='}') || (c == '}' && popped !='{')){
                    matched=false;
                    break;
                }
                if( (c == '(' && popped !=')') || (c == ')' && popped !='(')){
                    matched=false;
                    break;
                }
            }
        }
        if(matched && stack.isEmpty()){
            System.out.println("It's matching");
        }else{
            System.out.println("It's not matching");
        }


    }
}
