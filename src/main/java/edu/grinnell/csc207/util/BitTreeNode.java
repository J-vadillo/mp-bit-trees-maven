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



public BitTreeNode getLeft() {
    return left;
}

public BitTreeNode getRight() {
    return right;
}

public String getValue() {
    return value;
}


public void setValue(String str){
  this.value = str;
}

public void setLeft(BitTreeNode node){
  this.left = node;
}

public void setRight(BitTreeNode node){
  this.right = node;
}

  
} // class BitTreeNode<T>