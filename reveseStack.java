import java.util.*;
//http://www.geeksforgeeks.org/reverse-a-stack-using-recursion/
class reveseStack{

    public static void reverse(Stack s){
       while (!s.isEmpty()){
          try{
           s.pop();
           reverse(s);
           s.add(s.pop());
       }
       catch (EmptyStackException e) {
         }
      }

//s.pop();

//s.add(reverse(s));


    }

    public static void main(String args[]){

Stack<Integer> s = new Stack<Integer>();
s.add(1);
s.add(2);
s.add(3);
s.add(4);
s.add(5);
s.add(6);
reverse(s);
while(!s.empty()){
    System.out.print(s.pop()+" ");
    }





//System.out.print(s.pop());


    }


}
