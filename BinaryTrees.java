import java.util.*;

//1.Building a Tree from the given Preorder Sequence 
    public class BinaryTrees {
    static class Node{//Node represents one individual node of the Binary Tree
        int data;
        Node left;
        Node right;

        Node(int data){//Constructor: Creates a node with the given data
            this.data=data;
            this.left=null;//Initially, the node has no children
            this.right=null;
        }
    }
        static class BinaryTree{//BinaryTree contains the logic for building the tree
        static int idx=-1;//Initially -1 bcoz idx++ is done before accessing nodes[idx]
        public static Node buildTree(int[] nodes){//Keeps the track of the curr pos in the preorder array
        //static method belongs to the BinaryTree class-->so an obj of BinaryTree is not required to call it
            idx++;//Moves to the next element in the array
            if(nodes[idx]==-1){//-1 means there is no node at this position-->Therefore, return null to indicate an empty child
                return null;
            }
            Node newNode=new Node(nodes[idx]);//If the value is not -1, create a new Node
            newNode.left=buildTree(nodes);//Build and attach the left subtree
            newNode.right=buildTree(nodes);//Build and attach the right subtree
            return newNode;//Return the completed curr node
        }
    //2.Preorder Traversal: Root → Left → Right
        public static void preorder(Node root){
            if(root==null){//If there is no node-->stop this recursive call
                return;
            }
            System.out.print(root.data+" ");//First print the root
            preorder(root.left);//Then visit the left subtree
            preorder(root.right);//Finally visit the right subtree
        }
    //3.Inorder Traversal: Left → Root → Right
        public static void inorder(Node root){
            if(root==null){//If there is no node-->stop this recursive call
                return;
            }
            preorder(root.left);//First visit the left subtree
            System.out.print(root.data+" ");//Then print the root
            preorder(root.right);//Finally visit the right subtree
        }
    //4.Postorder Traversal: Left → Right → Root
        public static void postorder(Node root){
            if(root==null){//If there is no node-->stop this recursive call
                return;
            }
            preorder(root.left);//First visit the left subtree
            preorder(root.right);//Then visit the right subtree
            System.out.println(root.data+" ");//Finally print the root
        }
    }
    public static void main(String[] args){
        int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root=BinaryTree.buildTree(nodes);//buildTree() is static-->so we can call it directly using the class name
        System.out.println("The root of the curr preorder sequence is: "+root.data);//root itself is a Node object-->root.data gives the value stored inside that Node
        System.out.println("The preorder traversal of the tree is:");//Calling the preorder() method to print all the nodes in Root → Left → Right order
        BinaryTree.preorder(root);
        System.out.println();
        System.out.println("The inorder traversal of the tree is:");
        BinaryTree.inorder(root);
        System.out.println();
        System.out.println("The postorder traversal of the tree is:");
        BinaryTree.postorder(root);
    }
}
//
