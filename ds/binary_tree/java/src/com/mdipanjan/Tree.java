package com.mdipanjan;

public class Tree {
    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;
        public Node(int value){
            this.value = value;
        }
    }
    public Node root;
    // Insert an element into the tree
    public void insert(int value){
        if(root == null){
            root = new Node(value);
            return;
        }
        Node current = root;
        while (true){
            if(value < current.value){
                if(current.leftChild == null){
                    current.leftChild = new Node(value);
                    break;
                }
                current = current.leftChild;
            }else {
                if(current.rightChild == null){
                    current.rightChild = new Node(value);
                    break;
                }
                current = current.rightChild;
            }
        }
    }
    // Find an element from the tree
    public boolean find(int value){
        Node current = root;
        while (current != null){
            if(value < current.value){
                current = current.leftChild;
            }else if(value > current.value) {
                current = current.rightChild;
            }else {
                return true;
            }
        }
        return false;
    }
    // Depth First Search - (Depth First Traversal)
    // - Preorder =>  root -> left -> right
    // - Inorder =>   left -> root -> right
    // - Postorder => left -> right -> root
    public void preOrderTraversal(){
        preOrderTraversal(root);
    }
    private void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.value);
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    public void inOrderTraversal(){
        inOrderTraversal(root);
    }
    private void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.leftChild);
        System.out.println(root.value);
        inOrderTraversal(root.rightChild);
    }

    public void postOrderTraversal(){
        postOrderTraversal(root);
    }
    private void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.println(root.value);
    }
}
