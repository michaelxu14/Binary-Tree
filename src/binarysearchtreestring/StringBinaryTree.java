/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarysearchtreestring;

import java.util.Stack;

/**
 *
 * @author michael.roy-diclemen
 */
public class StringBinaryTree {
    //The root node
    private Node root;

    //Constructor
    public StringBinaryTree(){
        this.root = null;
    }
//------------------------------------------------------------------------------  
    //Adds the specified element to this tree if it is not already present.
    public boolean add(String item){
         //empty tree
         if (root == null){             
            root = new Node(item);
        }else {
            Node currentNode = root;
            int comp = item.compareTo(currentNode.getItem());  
            //while the item is smaller and left child is not empty //or the item is greater and right child is not empty
            while (comp < 0 && currentNode.getLeft() != null || 
                   comp > 0 && currentNode.getRight() != null){ 
                //move one level down to left or to right
                if (comp < 0){currentNode = currentNode.getLeft();}
                else {currentNode = currentNode.getRight();}
                //compare the item with the current node
                comp = item.compareTo(currentNode.getItem());             
            }
            //insert a node with the item to left or to right
            if (comp < 0){currentNode.setLeft(new Node(item));}
            else if (comp > 0){currentNode.setRight(new Node(item));}
            else {return false;} //the item is present and cannot be inserted
        }
        return true;
    }
//------------------------------------------------------------------------------  
    //Returns true if this tree contains the specified element.
    public boolean contains(String item){
        return false;
    }
    //Returns true if this tree contains no elements.
    public boolean isStringmpty(){
        return true;
    }
//------------------------------------------------------------------------------      
    //Removes all of the elements from this tree.
    public void clear(){
    }
    
    //Returns the number of elements in this tree.
    public int size(){
        return 0;
    }    
//------------------------------------------------------------------------------    
    //Returns the number of leaves in this tree
    public int countLeaves(){
        return 0;
    }      
    
    //Returns the number of levels in this tree
    public int countLevels(){
        return 0;
    }
//------------------------------------------------------------------------------    
    //Returns String representation of the tree. Stringlements are in natural order.
    @Override
    public String toString(){
        if (root == null){return "[]";}
        Stack<Node> stack = new Stack();
        Node currentNode = root;
        String s = "";
        while (!stack.empty() || currentNode != null){
            if (currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            }else {
                currentNode = stack.pop();
                s = s + currentNode.getItem().toString() +", ";
                currentNode = currentNode.getRight();
            }
        }
        return "["+ s.substring(0,s.length()-2) +"]";
    }
//------------------------------------------------------------------------------    
//    //Returns String representation of the tree. Stringlements are in order by level.
//    @Override
//    public String toString(){
//        if (root == null){return "[]";}
//        Queue<Node> q = new LinkedList<Node>(); //LinkedList class implements Queue interface
//        q.add(root);
//        String s = "";
//        while (!q.isEmpty()){
//            Node currentNode = q.remove();
//            s = s + currentNode.getItem().toString() +", ";
//            if (currentNode != null){
//                Node leftChild = currentNode.getLeft();
//                if (leftChild != null){q.add(leftChild);}
//                Node rightChild = currentNode.getRight();
//                if (rightChild != null){q.add(rightChild);}
//            }
//        }
//        return "["+ s.substring(0,s.length()-2) +"]";
//    }   
    
    /**Notice how this is essentially identical to a doubly linked list **/
  private class Node{
        private String item;
        private Node left;
        private Node right;
        //Node constructor
        public Node(String item){
            this.item = item;
            this.left = null;
            this.right = null;
        } 
        //getters and setters
        public String getItem(){
            return this.item;
        }
        public void setItem(String item){
            this.item = item;
        }
        public Node getLeft(){
            return this.left;
        }        
        public void setLeft(Node node){
            this.left = node;
        }
        public Node getRight(){
            return this.right;
        } 
        public void setRight(Node node){
            this.right = node;
        }  

        //helper methods
        private boolean isLeaf(){
            return false;
        }
        private int getHeight(){
            return 0;
        }
    }    
}
