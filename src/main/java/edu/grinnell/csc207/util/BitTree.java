package edu.grinnell.csc207.util;

import java.io.InputStream;
import java.io.PrintWriter;

/**
 * Trees intended to be used in storing mappings between fixed-length 
 * sequences of bits and corresponding values.
 *
 * @author Your Name Here
 */
public class BitTree {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  /**
   * The root of the tree.
   */
  BitTreeNode<T> root;

  /**
   * The number of values in the tree.
   */
  int size;

    /**
   * The number of values in the tree.
   */
  int bitsize;

  String

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   *
   */
  public BitTree(int n) {
    bitSize = n;
    this.root = null;
    this.size = 0;
  } // BinaryTree
  } // BitTree(int)

  // +---------------+-----------------------------------------------
  // | Local helpers |
  // +---------------+

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   *
   */
  public void set(String bits, String value) {
    // STUB
  } // set(String, String)

  /**
   *
   */
  public String get(String bits) {
    return "";  // STUB
  } // get(String, String)

  /**
   *
   */
  public void dump(PrintWriter pen) {
    // STUB
  } // dump(PrintWriter)

  /**
   *
   */
  public void load(InputStream source) {
    // STUB
  } // load(InputStream)

} // class BitTree
