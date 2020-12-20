package com.litvil.algo.tree;

import com.litvil.algo.tree.base.Node;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Slf4j
class TreeTraversalTest {

  TreeTraversal tree;

  @BeforeEach
  public void setupEach() {
    tree = new TreeTraversal();
    tree.root = new Node(1);

    tree.root.addLeft(2);
    tree.root.addRight(3);

    tree.root.left.addLeft(4);
    tree.root.left.addRight(5);

    /**
     *      1
     *    /  \
     *   2    3
     *  / \
     * 4   5
     */

  }

  @Test
  @DisplayName("Draw pre-order")
  public void test1() {
    // Pre-order (Root, Left, Right) : 1 2 4 5 3
    System.out.println("Pre-order traversal of binary tree is ");
    tree.printPreorder();
  }

  @Test
  @DisplayName("Draw in-order")
  public void test2() {
    // In-order (Left, Root, Right) : 4 2 5 1 3
    System.out.println("In-order traversal of binary tree is ");
    tree.printInorder();
  }

  @Test
  @DisplayName("Draw post-order")
  public void test3() {
    // Post-order (Left, Right, Root) : 4 5 2 3 1
    System.out.println("Post-order traversal of binary tree is ");
    tree.printPostorder();
  }
}