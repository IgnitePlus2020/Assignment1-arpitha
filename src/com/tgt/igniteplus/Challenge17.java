//Challenge 17:A program to print all the leaf nodes in a binary tree.

package com.tgt.igniteplus;

class Node
{
    String value;
    Node left;
    Node right;
    Node(String value)
    {
        this.value = value;
    }
    Node(String value,Node left,Node right)
    {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    boolean isLeaf()
    {
        if(left==null&&right==null)
            return true;
        return false;
    }
    public static void printLeaves(Node node)
    {
        if(node==null)
            return;
        if(node.isLeaf())
            System.out.printf("%s ", node.value);
        printLeaves(node.left);
        printLeaves(node.right);
    }

}
public class Challenge17 {
    public static void main(String[] args)
    {
        Node d=new Node("d");
        Node e =new Node("e");
        Node g =new Node("g");
        Node k =new Node("k");
        Node c =new Node("c", d, null);
        Node h =new Node("h", k, null);
        Node b =new Node("b", c, e);
        Node f =new Node("f", g, h);
        Node root=new Node("a", b, f);
        System.out .println("Leaf nodes of binary tree");
        Node.printLeaves(root);
    }
}
