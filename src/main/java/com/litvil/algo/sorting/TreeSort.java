package com.litvil.algo.sorting;

import com.litvil.algo.tree.base.BinaryTree;
import com.litvil.algo.tree.base.Node;
import java.util.ArrayList;
import java.util.List;

/**
 * Average Case Time Complexity : O(n log n) Adding one item to a Binary Search tree on average takes O(log n) time.
 * Therefore, adding n items will take O(n log n) time
 * Worst Case Time Complexity : O(n2)
 */
public class TreeSort extends BinaryTree {
  // This method mainly calls insertRec()
  private void insert(int key) {
    root = insertRec(root, key);
  }

  //A recursive function to insert a new key in BST
  private Node insertRec(Node root, int key) {
    //If the tree is empty, return a new node
    if (root == null) {
      root = new Node(key);
      return root;
    }

    // Otherwise, recur down the tree
    if (key < root.key) {
      root.left = insertRec(root.left, key);
    } else if (key > root.key) {
      root.right = insertRec(root.right, key);
    }

    return root;
  }

  // A function to do inorder traversal of BST
  void inorderRec(Node root, ArrayList<Integer> out) {
    if (root != null) {
      inorderRec(root.left, out);
      // System.out.print(root.key + " ");
      out.add(root.key);
      inorderRec(root.right, out);
    }
  }

  private void treeins(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      insert(arr[i]);
    }
  }

  public static List<Integer> sort(int input[]) {
    TreeSort tree = new TreeSort();
    tree.treeins(input);
    ArrayList<Integer> out = new ArrayList<>();
    tree.inorderRec(tree.root, out);

    return out;
  }
}
