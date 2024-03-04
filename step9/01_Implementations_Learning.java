/* Implementation for stack 
 a) stack using array/arrayList
 b) stack using queue
 c) stack using LinkedList
*/

// a) stack using array :
class mainClass{
 public static void main(String args[]){
   stackClass s = new stackClass();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println("Top of the stack before deleting any element " + s.top());
        System.out.println("Size of the stack before deleting any element " + s.size());
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Size of the stack after deleting an element " + s.size());
        System.out.println("Top of the stack after deleting an element " + s.top());
 }
}

class stackClass{
  int size = 100;
  int arr[] = new int [size]; int top = -1;
  public void push(int x){
    top++;
    arr[top] = x;
  }
  public int pop(){
    int x = arr[top];
    top--;
    return x;
      
  }
  public int top(){
    return arr[top];
  }
  public int size(){
    return top+1;
  }
}

// b: stack using queue 


class mainClass {
  public static void main(String args[]){
    stackClass s = new stackClass();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.printStack();
    
  }
}
class stackClass{
  Queue<Integer> q = new LinkedList<>();
  public void push(int x){
    q.add(x);
    for(int i = 0;i<q.size()-1;i++){
      q.add(a.remove());
    }
  }
  public int pop(){
    return q.remove();
  }
  public int size(){
    return q.size();
  }
  public int top(){
   return q.peek();
  }
  public void printStack(){
   System.out.print(q);
}

// c : stack using linkedList 

class mainClass{
  public static void main(String args[]){
  stackClass s = new stackClass();
    s.push(37);
    s.push(35);
    s.push(34);
    s.push(32);
    s.printStack();
    
  }
  }
  
class stackClass{
 public class Node{
 Node next ;
   int data;
   public Node(int data){
     this.data = data;
     this.next = null;
 }
   
}
  Node top ;
  int size ;
  public stackClass(){
    this.top = null;
    this.size = 0;
  }
  public void push(int x){
    Node element = new Node(x);
    element.next = top;
    top = element;
    size++;
  }
  public int pop(){
    if(top == null)return -1;
    int topData = top.data;
    Node temp = top;
    top = top.next ; size--;
    return topData;
  }
  public int size(){
  return size;
  }
  public boolean isEmpty(){
  return top == null;
  }
  public void printStack(){
  Node curr = top;
    while(curr!= null){
     System.out.print(curr.data+"->");
      curr = curr.next;
    }
    System.out.print("null");
  }  
}
  



/* Implementation for queue .
 a) queue using array/arrayList
 b) queue using LinkedList
 c) queue using stack
  */














