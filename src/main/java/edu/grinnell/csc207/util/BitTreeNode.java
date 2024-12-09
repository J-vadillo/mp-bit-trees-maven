package edu.grinnell.csc207.util;


/**
 * Nodes in a Bit tree.
 *
 * @author Samuel A. Rebelsky (original)

 * @param <T>
 *   The type of value stored in nodes.
 *
 * @author Jana Vadillo(modified for Bit trees)
 *  
 */
class BitTreeNode {

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The value in this node.
   */
  String value;

  /**
   * The left subtree.
   */
  BitTreeNode left;

  /**
   * The right subtree.
   */
  BitTreeNode right;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new bit tree node that is a branch (does not store any)

   * @param l
   *   The left subtree.
   * @param r
   *   The right subtree.
   */
  public BitTreeNode(BitTreeNode l, BitTreeNode r) {
    this.value = null;
    this.left = l;
    this.right = r;
  } // BitTreeNode(T, BitTreeNode, BitTreeNode)

  /**
   * Create a new leaf (a Bit tree node with a value, but no subtrees).
   *
   * @param val
   *   The value to store in the node.
   */
  public BitTreeNode(String val) {
    this.value = val;
    this.left = null;
    this.right = null;

  
  } // BitTreeNode(T)
} // class BitTreeNode<T>