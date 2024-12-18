package edu.grinnell.csc207.main;

import java.io.PrintWriter;
import edu.grinnell.csc207.util.BrailleAsciiTables;

/**
 * the main workhorse of the class, takes in a parameter for output
 * type and input and returns the input in that style.
 *
 * @author Jana Vadillo
 */
public class BrailleASCII {
  // +------+--------------------------------------------------------
  // | Main |
  // +------+

  /**
   * main function.
   * @param args 2 arguments, one sould be the output format and the other should
   *             be the input string.
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    if (args.length != 2) {
      throw new Error("invalid number of parameters, please only give the output type and string");
    } //check the right number of inputs.
    String output = args[0];
    String str = args[1];
    String returnStr = "";

    if (output.equals("ascii")) {
      if (str.length() % 6 != 0) {
        throw new Error("invalid length of bit String");
      } //check if wthe string is the correct size to have a binary input.

      int letterAmt = str.length() / 6;

      for (int n = 0; n < letterAmt; n++) {
        String bitString = str.substring(n * 6, (n + 1) * 6);
        try {
          String currentLetter = BrailleAsciiTables.toAscii(bitString);
          returnStr += currentLetter;
        } catch (Exception e) {
          throw new Error("Trouble translating because No corresponding value");
        } //try translating the individual letters.
      } // itterate through and translate each of the letters.

    } else if (output.equals("braille")) {
      str = str.toUpperCase();
      pen.println(str);
      char[] charArray = str.toCharArray();
      for (int n = 0; n < charArray.length; n++) {
        char letter = charArray[n];
        if (Character.isUpperCase(letter)) {
          String braille = BrailleAsciiTables.toBraille(letter);
          returnStr += braille;
        } else {
          throw new Error("unable to read, make sure only letters and spaces are present.");
        } // try translating each of the letters to braile.
      } // itterate through each of the letters present.

    } else if (output.equals("unicode")) {
      str = str.toUpperCase();
      char[] charArray = str.toCharArray();
      for (int n = 0; n < charArray.length; n++) {
        char letter = charArray[n];
        if (Character.isUpperCase(letter)) {
          String braille = BrailleAsciiTables.toBraille(letter);
          String unicode = BrailleAsciiTables.toUnicode(braille);
          returnStr += unicode;
        } else {
          throw new Error("unable to read, make sure only letters and spaces are present.");
        } //attempt to turn the letters first, to braille and then tounicode.
      } //ittreate through each charachter

    } else {
      throw new Error("Invalid type for output, please select, unicode, braille or ascii");
    } // invalid output check.
    pen.println(returnStr);
    pen.close();
  } // main(String[]

} // class BrailleASCII
