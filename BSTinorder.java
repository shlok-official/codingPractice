class BSTinorder{

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
BSTinorder(){
root =null;

}
public static void main(String args[]){

BSTinorder tree = new BSTinorder();
tree.inorder(key);



}



}