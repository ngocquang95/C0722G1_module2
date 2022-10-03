package ss11_stack_queue;

import java.util.Stack;

public class StackStudy {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

//        for (int i = 0; i < stack.size(); i++) {
//            System.out.println(stack.get(i));
//        }
        //1 2
//        System.out.println(stack.peek()); // 3
//        System.out.println(stack.pop()); // 3
//        System.out.println(stack.pop()); // 3
//        System.out.println(stack.pop()); // 3
        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); //
        }
//        System.out.println(stack.peek()); // 2

    }
}
