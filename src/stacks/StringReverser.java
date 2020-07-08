package stacks;

import java.util.Stack;

public class StringReverser {

    public String reversed(String input){
        if(input == null){
            throw new IllegalArgumentException();
        }
        Stack<Character> stack = new Stack<>();
        for (char ch: input.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }
}
