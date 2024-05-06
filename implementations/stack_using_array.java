 // stack using array

import java.util.*;
 // it is the main class
public class stack_using_array {

    public static void main(String[] args) {

        stack s = new stack(10);
        s.push(6);
        s.push(3);
        s.push(7);
        s.push(17);
        s.push(77);
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.top());
        System.out.println(s.size());

    }
}

// here is the stack class

class stack {
    int size ;
    int arr[] ;
    int top;

    stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int x) {
        top++;
        arr[top] = x;
    }

    int pop() {
        int x = arr[top];
        top--;
        return x;
    }

    int top() {
        return arr[top];
    }

    int size() {
        return top + 1;
    }
}
