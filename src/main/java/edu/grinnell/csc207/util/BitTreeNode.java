package edu.grinnell.csc207.util;

/**
 * Nodes in a Bit tree.
 *
 * @author Samuel A. Rebelsky (original
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
   * Create a new bit tree node that is a branch (does not store any).
   * @param l
   *          The left subtree.
   * @param r
   *          The right subtree.
   */
  public BitTreeNode(BitTreeNode l, BitTreeNode r) {
    this.value = null;
    this.left = l;
    this.right = r;
  } // BitTreeNode(T, BitTreeNode, BitTreeNode)

  /**
   * gets the left stored path in the node.
   * @return the value stored
   */
  public BitTreeNode getLeft() {
    return left;
  } //getleft()

  public BitTreeNode getRight() {
    return right;
  } // getright();

  public String getValue() {
    return value;
  } //getvalue()

  public void setValue(String str) {
    this.value = str;
  } //setvalue(String)

  public void setLeft(BitTreeNode node) {
    this.left = node;
  } //setleft(BitTreeNode)

  public void setRight(BitTreeNode node) {
    this.right = node;
  } //setRight(BitTreeNode)

} // class BitTreeNode<T>
