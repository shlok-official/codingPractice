import java.util.*;

class subtractLinkList{
static Node head1,head2;

void subtract(Node s1, Node s2){

Stack<Integer> stk1 = new Stack<Integer>();
Stack<Integer> stk2 = new Stack<Integer>();

while(s1 != null){
stk1.push(s1.data);
s1= s1.next;

}
while(s2 != null){
stk2.push(s2.data);
s2= s2.next;

}
while(!s1.empty()){
System.out.println(s1.pop());}



}

    public static void main(String args[]){
    
    subtractLinkList ll = new subtractLinkList();
 ll.head1 = new Node(5);
 Node second1      = new Node(10);
 Node third1       = new Node(15);
 ll.head1.next = second1;
 second1.next = third1;
     

       
 ll.head2 = new Node(1);
 Node second2      = new Node(2);
 Node third2       = new Node(3);
 ll.head2.next = second2;
 second2.next = third2;

 ll.subtract(head1,head2);
    
    }
}


class Node{
 int data;
 Node next;

 Node(int d){
     data = d;
     next = null;
 }
}