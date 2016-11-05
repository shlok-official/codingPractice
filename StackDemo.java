import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class StackDemo {
int i =10000;
    public void showpush(Stack st, int a) {
      st.push(new Integer(a));
      System.out.println("push(" + a + ")");
      System.out.println("stack: " + st);
      if(a<i)
      i=a;
    
   }
  public void min(){
     System.out.println(i);
 }
    public void showpop(Stack st) {
      System.out.print("pop -> ");
      Integer a = (Integer) st.pop();
      System.out.println(a);
      System.out.println("stack: " + st);
   }

   public static void main(String args[]) {
       StackDemo sd = new StackDemo();
      Stack st = new Stack();
      System.out.println("stack: " + st);
      sd.showpush(st, 42);
      sd.showpush(st, 66);
      sd.showpush(st, 9);
      sd.showpush(st, 1);
      sd.showpush(st, -9);
      sd.showpush(st, 199);
      sd.showpush(st, 77);
    //   showpop(st);
    //   showpop(st);
    //   showpop(st);
      sd.min();

     // System.out.println("MIn Element " + i);
      try {
         sd.showpop(st);
      }catch (EmptyStackException e) {
         System.out.println("empty stack");
      }
   }
}