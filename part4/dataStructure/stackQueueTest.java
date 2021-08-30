package part4.dataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackQueueTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("가");
        stack.push("나");
        stack.push("다");

//        System.out.println(stack.search("가"));

        Queue<String> queue = new LinkedList<>();
        queue.offer("가");
        queue.offer("나");
        queue.offer("다");

        queue.add("라");
        queue.add("마");
        queue.add("바");

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
//        System.out.println(stack.peek());
//        System.out.println(queue.peek());
//        System.out.println(queue.element());
//        System.out.println(queue.poll());
//        System.out.println(queue.remove());

    }
}
