import java.util.*;

class onebit_stack {
    public static void main(String args[]){

Scanner in = new Scanner(System.in);
System.out.print("Please enter a number for binary conversion");
int num = in.nextInt();
Stack<Integer> stk =new Stack<>();
while (num !=0){
    int d = num%2;
 stk.push(d);
 num /=2;
}
while(!(Stack.isEmpty())){//error
    System.out.println(stk.pop());
}
    }

}

