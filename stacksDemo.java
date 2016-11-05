 //stack using 
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
 class stacksDemo{
  Queue<Integer> q1 = new LinkedList<>();  
 

// Push element x onto stack.
public void push(int x) {
    q1.add(x);
    int size = q1.size();
    while(size>1){
        q1.add(q1.remove());
        size--;
    }
}
public void pop(){
    q1.remove();
    System.out.print("popped");

}

public boolean empty() {
    return q1.isEmpty();
}
public int top() {
    return q1.peek();
}
 public static void main(String args[]) {
stacksDemo sd = new stacksDemo();
sd.push(1);
sd.push(2);


 }




 }