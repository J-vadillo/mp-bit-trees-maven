package edu.grinnell.csc207.util;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Trees intended to be used in storing mappings between fixed-length
 * sequences of bits and corresponding values.
 *
 * @author Jana Vadillo
 */
public class BitTree {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  /**
   * The root of the tree.
   */
  BitTreeNode root;

  /**
   * The number of values in the tree.
   */
  int size;

  /**
   * The number of values in the tree.
   */
  int bitSize;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Bit tree structure.
   * @param n the integer to put in.
   */
  public BitTree(int n) {
    bitSize = n;
    this.root = new BitTreeNode(null, null);
  } // BitTree(int)

  // +---------------+-----------------------------------------------
  // | Local helpers |
  // +---------------+

  private boolean checkBit(char c) throws IndexOutOfBoundsException {
    if (c == '1') {
      return true;
    } else if (c == '0') {
      return false;
    } else {
      throw new IndexOutOfBoundsException();
    } // check a charachter to make sure its either a 0 or 1.
  } // checkbit(char)

  private BitTreeNode traverse(String bits, boolean set) throws IndexOutOfBoundsException {
    char[] bitArray = bits.toCharArray();
    if (!(bitArray.length == this.bitSize)) {
      throw new IndexOutOfBoundsException();
    } // check to see if the input is a valid length

    BitTreeNode cursor = this.root;
    for (int i = 0; i < (bitArray.length); i++) {
      if (checkBit(bitArray[i])) {
        if (cursor.getLeft() == null) {
          if (set) {
            cursor.setLeft(new BitTreeNode(null, null));
          } else {
            throw new IndexOutOfBoundsException();
          } // throw exception if the node does not correspond to an existing element.

        } // if path does not exist throw an exception
        cursor = cursor.getLeft();
      } else {
        if (cursor.getRight() == null) {
          if (set) {
            cursor.setRight(new BitTreeNode(null, null));
          } else {
            throw new IndexOutOfBoundsException();
          } // if setting a path, make a new element, if reading note no element exists.
        } // different actions for left and right.
        cursor = cursor.getRight();
      } // code for left and right.
    } // itterate through until you reach the last open node.
    return cursor;
  } // traverse(String boolean)

  private void recursiveDump(PrintWriter pen, BitTreeNode node, String path) {
    if (node == null) {
      return;
    } else if (node.getValue() != null) {
      pen.println(path + "," + node.getValue());
    } else {
      recursiveDump(pen, node.left, path + "1");
      recursiveDump(pen, node.right, path + "0");
    } // else
  } // Recursivedump

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * adds value to the position designated by bits.
   * @param bits  the path to follow
   * @param value the value to store
   * @throws IndexOutOfBoundsException //invalid size or format of path.
   */
  public void set(String bits, String value) throws IndexOutOfBoundsException {
    BitTreeNode cursor = traverse(bits, true);
    cursor.setValue(value);
  } // set(String, String)

  /**
   * gets the value stored by the bitstring.
   * @param bits the path to follow
   * @return the value stored
   */
  public String get(String bits) {
    BitTreeNode cursor = traverse(bits, false);
    return cursor.getValue();
  } // get(String, String)

  /**
   * prints the whole path.
   * @param pen pen to use.
   */
  public void dump(PrintWriter pen) {
    recursiveDump(pen, this.root, "");
  } // dump(PrintWriter)

  /**
   * loads a bitree from a file of source.
   * @param source file to use.
   */
  public void load(InputStream source) {
    Scanner eyes = new Scanner(source);
    while (eyes.hasNext()) {
      String[] inputs = eyes.nextLine().split(",");
      this.set(inputs[0], inputs[1]);
    } // while
    eyes.close();
  } // load(InputStream)

} // class BitTree
