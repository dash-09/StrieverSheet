

public class queue_using_linkedList {
   
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
     static  Node head = null;
     static Node tail = null;
     

        static boolean isEmpty() {
            return head == null && tail == null;
        }

        static void add(int x) {
            Node newnode = new Node(x);
            if (tail == null) {
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
            return;
        }

        public int remove() {
            if (isEmpty()) {
                return -1;
            }
            if (head == tail) {
                tail = null;
            }
            int front = head.data;
            head = head.next;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
         }
        
     
public static void main(String[] args) {
    queue_using_linkedList q = new queue_using_linkedList();
    q.add(31);
    q.add(32);
    q.add(33);
    q.add(34);

    System.out.println(q.peek());
    System.out.println(q.remove());
    System.out.println(q.peek());

}

}
