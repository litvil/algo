package com.litvil.algo.tree;

import com.litvil.algo.tree.base.BinaryTree;
import com.litvil.algo.tree.base.Node;
import java.util.Stack;

// Average & Worst Time: O(n2) | Space: O(1)
// Bubble sort is also very simple. It iterates through the array and compares each element with the item after it
// and swaps them accordingly based on their value. It will take O(n2) passes over the input data structure
// to get it entirely sorted.
// https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/?ref=lbp

/**
 *      1
 *    /  \
 *   2    3
 *  / \
 * 4   5
 * Depth First Traversals:
 * (a) Inorder (Left, Root, Right) : 4 2 5 1 3
 * (b) Preorder (Root, Left, Right) : 1 2 4 5 3
 * (c) Postorder (Left, Right, Root) : 4 5 2 3 1
 */
public class TreeTraversal extends BinaryTree {

  public void printPostorder(Node node) {
    if (node == null) {
      return;
    }

    // first recur on left subtree
    printPostorder(node.left);

    // then recur on right subtree
    printPostorder(node.right);

    // now deal with the node
    System.out.print(node.key + " ");
  }

  /* Given a binary tree, print its nodes in inorder*/
  public void printInorder(Node node) {
    if (node == null) {
      return;
    }

    /* first recur on left child */
    printInorder(node.left);

    /* then print the data of node */
    System.out.print(node.key + " ");

    /* now recur on right child */
    printInorder(node.right);
  }

  /* Given a binary tree, print its nodes in inorder*/
  public void printInorderNoRecursion(Node node) {

    if (root == null) {
      return;
    }

    Stack<Node> s = new Stack<>();
    Node curr = root;

    // traverse the tree
    while (curr != null || s.size() > 0) {

      /* Reach the left most Node of the curr Node */
      while (curr != null) {
        // place pointer to a tree node on the stack before
        // traversing the node's left subtree
        s.push(curr);
        curr = curr.left;
      }

      /* Current must be NULL at this point */
      curr = s.pop();

      System.out.print(curr.key + " ");

            /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
      curr = curr.right;

    }
  }

  /* Given a binary tree, print its nodes in preorder*/
  public void printPreorder(Node node) {
    if (node == null) {
      return;
    }

    /* first print data of node */
    System.out.print(node.key + " ");

    /* then recur on left subtree */
    printPreorder(node.left);

    /* now recur on right subtree */
    printPreorder(node.right);
  }

  // Wrappers over above recursive functions
  public void printPostorder() {
    printPostorder(root);
  }

  public void printInorder() {
    printInorder(root);
  }

  public void printPreorder() {
    printPreorder(root);
  }
}
