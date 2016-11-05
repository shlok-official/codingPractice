
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

 class level_bst{

    Node root;
 

 void levelOrderPrint(){

     Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty())
        {
             Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");
             /*Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
 
            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }
 
        public static void main(String args[]) 
    {
        /* creating a binary tree and entering 
         the nodes */
        level_bst tree_level = new level_bst();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
 
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.levelOrderPrint();
    }
}
 