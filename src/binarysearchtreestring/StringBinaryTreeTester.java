package binarysearchtreestring;
/**
 * Tester program for a custom Binary Tree
 * @author ICS4U
 */
import java.util.TreeSet;

public class StringBinaryTreeTester {
    public static void main(String[] args){
        StringBinaryTree tree = new StringBinaryTree();
        System.out.println("\nCustom implementation");
        System.out.println(tree);
        tree.add("rhhs");
        System.out.println(tree);
        tree.add("is");
        System.out.println(tree);
        tree.add("the");
        System.out.println(tree);
        tree.add("best");
        System.out.println(tree);
        tree.add("school");
        System.out.println(tree);
        
        System.out.println("\nJava implementation");
        TreeSet treeSet = new TreeSet();
        System.out.println(treeSet);   
        treeSet.add("rhhs");
        System.out.println(treeSet);
        treeSet.add("is");
        System.out.println(treeSet);
        treeSet.add("the");
        System.out.println(treeSet);
        treeSet.add("best");
        System.out.println(treeSet);
        treeSet.add("school");
        System.out.println(treeSet);        
    }
}