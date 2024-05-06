 import java.util.*;
class Queue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public Queue() {
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        if (output.empty()) {
            while (input.empty() == false) {
                output.push(input.peek());
                input.pop();
            }
        }
        int x = output.peek();
        output.pop();
        return x;
    }

    public int peek() {
        if (output.empty()) {
            while (input.empty() == false) {
                output.push(input.peek());
                input.pop();
            }
        }
        return output.peek();
    }

    public int size() {
        return (input.size() + output.size());
      }
}
public class queue_using_stack {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
         
        System.out.println(q.pop());
        System.out.println(q.peek());

    }
}
