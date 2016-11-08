
import java.util.Queue;
import java.util.*;
import java.util.LinkedList;

class Node{
    int data;
    Node left, right;

public Node(int item) {
            data = item;
            left = right = null;
        }
}

 class all_bst{

    Node root;
 

 //void levelOrderPrint(){
     //-----------------------------------------LEVEL ORDER TRAVERSAL (SAME LINE)---------------------
// Queue<Node> q1 = new LinkedList<Node>();

//     q1.add(root);
    
//     while(!q1.isEmpty())
//     {
//         Node temp= q1.poll();
//         System.out.println(temp.data);
//         if(temp.left != null)
//         q1.add(temp.left);

//         if(temp.right!= null)
//         q1.add(temp.right);


//     }
//----------------------------------------------------------------------------------------------------------
//----------------------------------------------LEVEL ORDER TRAVERSAL DIFFERENT LINE-------------------------

// Queue<Node> q1 = new LinkedList<Node>();
// Queue<Node> q2 = new LinkedList<Node>();
// q1.add(root);
// while(!q1.isEmpty() || !q2.isEmpty()){
// while(!q1.isEmpty())
// {
//     Node temp = q1.poll();
//     System.out.print(temp.data+" ");
//     if(temp.left != null)
//     q2.add(temp.left);
//     if(temp.right != null)
//     q2.add(temp.right);
// }
// System.out.println();
// while(!q2.isEmpty())
// {
//     Node temp = q2.poll();
//     System.out.print(temp.data+" ");
//     if(temp.left != null)
//     q1.add(temp.left);
//     if(temp.right != null)
//     q1.add(temp.right);
// }
// System.out.println();

// }
// }
 //------------------------------------------------------------------------------------------
//---------------------------------------SIZE OF BST--------------------------------------
//  void netSize(){
//     int ss = sizeOfTree(root);
//     System.out.print(ss);
//  }
//    int sizeOfTree(Node root){
//    if(root==null)
//    return 0;
//    int leftSize = sizeOfTree(root.left);
//    int rightSize = sizeOfTree(root.right);
//    return 1+leftSize+rightSize;


//    }
   //------------------------------------------------------------------------------------------
   //---------------------------------------HEIGHT OF BST--------------------------------------
//  void netHeight(){
//     int ss = heightOfTree(root);
//     System.out.print(ss);
//  }
//    int heightOfTree(Node root){
//    if(root==null)
//    return 0;
//    int leftHeight = heightOfTree(root.left);
//    int rightHeight = heightOfTree(root.right);
//    return 1+ Math.max(leftHeight,rightHeight);
//---------------------------------SPIRAL PRINTING------------------------
//Use of two stacks
//we can also use one deque and use null as seperator   

// void levelOrderPrint(){
//         Stack<Node> q1 = new Stack<Node>();//Use of stack instead of queue
//         Stack<Node> q2 = new Stack<Node>();
//         q1.add(root);
//         while (!q1.isEmpty() || !q2.isEmpty()) {
//             while (!q1.isEmpty()) {
//                 Node temp = q1.pop();
//                 System.out.print(temp.data + " ");
//                 if (temp.left != null)
//                     q2.add(temp.left);
//                 if (temp.right != null)
//                     q2.add(temp.right);
//             }
//             System.out.println();
//             while (!q2.isEmpty()) {
//                 Node temp = q2.pop();
//                 System.out.print(temp.data + " ");
//                 if (temp.right != null)//swapped with bottom
//                     q1.add(temp.right);
//                 if (temp.left != null)
//                     q1.add(temp.left);

//             }
//             System.out.println();
//         }
// }

   
   //------------------------------------------------------------------------------------------
   //--------------------------------------CHECK BT is BST-------------------------------------
// boolean isBST(){
//  return BSTcheck(Node root,Integer.MIN_VALUE, Integer.MAX_VALUE);
// }


// boolean BSTcheck(Node root, int min, int max){
// if(root==null)
// return 1;
// if(root.data <=min || root.data > max)
// return 0;
// return BSTcheck(root.left , min , root.data ) && BSTcheck(root.right,root.data,max);

// }
   
   
    
 
        public static void main(String args[]) 
    {
        /* creating a binary tree and entering 
         the nodes */
        all_bst tree_level = new all_bst();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
 
        //System.out.println("Level order traversal of binary tree is - ");
        //tree_level.levelOrderPrint();
        //tree_level.netSize();
        //tree_level.netHeight();
        tree_level.isBST();
       
    }
}
 