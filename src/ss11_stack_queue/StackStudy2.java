package ss11_stack_queue;

import java.util.Stack;

public class StackStudy2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int n = 2000;
        while (n > 0) {
            stack.push(n % 2);
            n /= 2; // n = n / 2
        }

//        while (!stack.isEmpty()) {
//            System.out.print(stack.pop()); // 11111010000
//                                           // 11111010000
                                             // 11111010000
//        }

//        for (int i = stack.size() - 1; i >= 0; i--) {
//            System.out.print(stack.pop());
//        }

        int size =  stack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop());
        }
    }
}
