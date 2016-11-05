
import java.util.Queue;
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
 

 void levelOrderPrint(){
Queue<Node> q1 = new LinkedList<Node>();
    q1.add(root);
    
    while(!q1.isEmpty())
    {
        Node temp= q1.poll();
        System.out.println(temp.data);
        if(temp.left != null)
        q1.add(temp.left);

        if(temp.right!= null)
        q1.add(temp.right);


    }
    }
 
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
 
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.levelOrderPrint();
    }
}
 