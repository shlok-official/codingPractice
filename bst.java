public class bst{


// Class containing left and right child of current node and key value
class Node {
    int key;
    Node left, right;

     public Node(int item) {
            key = item;
            left = right = null;
        }
}

//root of BST
Node root;
//constructor
bst(){
root =null;

}

//search function
void searchkey(int key) {
        search(root, key);
        
       
    }

public Node search(Node root, int key)
{
    // Base Cases: root is null or key is present at root
    if (root==null || root.key==key)
        return root;
 
    // val is greater than root's key
    if (root.key > key)
        return search(root.left, key);
 
    // val is less than root's key
    return search(root.right, key);
}

void insert(int key) {
       root = insertRec(root, key);
    }
     Node insertRec(Node root, int key) {
 
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }
 
        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
 
        /* return the (unchanged) node pointer */
        return root;
    }
 void inorder()  {
       inorderRec(root);
    }
 
    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key+" ");
            inorderRec(root.right);
        }
    }

void preorder()  {
       preorderRec(root);
    }
 
    // A utility function to do inorder traversal of BST
    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key+" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    void postorder()  {
       postorderRec(root);
    }
 
    // A utility function to do inorder traversal of BST
    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key+" ");
            
        }
    }
    public static void main(String[] args){
        bst tree = new bst();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
 
        // print inorder traversal of the BST
       tree.inorder();
       System.out.println("----");
       tree.preorder();
       System.out.println("-----");
       tree.postorder();
       System.out.println("-----");
       tree.inorder();
       System.out.println("----");
    tree.searchkey(20);
      


    }
}


