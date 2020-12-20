package com.litvil.algo.tree.base;

public class Node {
  public int key;
  public Node left;
  public Node right;

  public Node(int item) {
    key = item;
    left = right = null;
  }

  public void addLeft(int item) {
    left = new Node(item);
  }

  public void addRight(int item) {
    right = new Node(item);
  }
}
