package com.example.Datastructure.Trees;


class Node{
    int value;
    Node left;
    Node right;

    Node(int item){
        value =  item;
        left = null;
        right = null;
    }
}
public class Implement {
    Node root=null;

    void insert(int value){
        root = insertRec(root,value);
    }

    Node insertRec(Node root,int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(value<root.value){
            root.left= insertRec(root.left,value);
        }else if(value>root.value){
            root.right = insertRec(root.right,value);
        }
        return root;

    }

    void inorder(){
        inorderRec(root);
    }

    void inorderRec(Node root){
        if(root!=null){
            inorderRec(root.left);
            System.out.println(root.value);
            inorderRec(root.right);
        }
    }

    boolean search(int value){
        return searchRec(root,value);
    }

    boolean searchRec(Node root,int value){
       if(root == null){
        return false;
       }    

       if(root.value == value){
        return true;
       }
       if(value<root.value){
        return searchRec(root.left,value);
       }
       return searchRec(root.right,value);
    }

     void delete(int value){
        deleteRec(root,value);
        System.out.println("The deleted records are "+value);
     }

     void deleteRec(Node root,int value){
        if(root==null){
            System.out.println("No root");
        }
        else if(root.value == value){
            System.out.println("root deleted");
        }
        else if(value<root.value){
            deleteRec(root.left,value);
        }
        else {
            deleteRec(root.right,value);
        }

     }

     

    public static void main(String args[]){

        Implement tree = new Implement();
        tree.insert(50);
        tree.insert(40);
        tree.insert(60);
        tree.insert(30);
        tree.insert(25);

        System.out.println("Inorder traversal of the tree is ");
        tree.inorder();

       System.out.println(tree.search(40));
       System.out.println(tree.search(15));

         tree.delete(30);

    
    }    
}
