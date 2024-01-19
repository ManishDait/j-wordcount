package io.github.manishdait.ccwc;

import java.util.Scanner;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
  public static void main(String[] args) throws IOException {
    boolean showByteCount = false;
    boolean showWordCount = false;
    boolean showLineCount = false;
    boolean showCharCount = false;

    String filename = null;

    for (String arg : args) {
      if (arg.equals("-c")) {
        showByteCount = true;
      } else if (arg.equals("-l")) {
        showLineCount = true;
      } else if (arg.equals("-w")) {
        showWordCount = true;
      } else if (arg.equals("-m")) {
        showCharCount = true;
      } else {
        filename = arg;
      }
    }

    if (showByteCount) {
      System.out.print(countByte(filename) + " ");
    }
    if (showWordCount) {
      System.out.print(countWord(filename) + " ");
    }
    if (showLineCount) {
      System.out.print(countLine(filename) + " ");
    }
    if (showCharCount) {
      System.out.print(countChar(filename) + " ");
    }
    if (!showByteCount || !showCharCount || !showLineCount || !showWordCount) {
      System.out.print(countLine(filename) + " " + countWord(filename) + " " + countByte(filename) + " ");
    }
    System.out.println(filename);

  }

  protected static long countByte(String filename) throws IOException {
    long byteCount = 0;

    FileInputStream stream = new FileInputStream(filename);

    while (stream.read() != -1) {
      byteCount++;
    }

    stream.close();

    return byteCount;
  }

  protected static long countLine(String filename) throws IOException {
    long lineCount = 0;

    File file = new File(filename);
    Scanner stream = new Scanner(file);

    while (stream.hasNextLine()) {
      stream.nextLine();
      lineCount++;
    }

    stream.close();

    return lineCount;
  }

  protected static long countWord(String filename) throws IOException {
    long wordCount  = 0;

    File file = new File(filename);
    Scanner stream = new Scanner(file);

    while (stream.hasNext()) {
      stream.next();
      wordCount++;
    }

    stream.close();

    return wordCount;
  }

  protected static long countChar(String filename) throws IOException {
    long charCount = 0;


    BufferedReader stream = new BufferedReader(new FileReader(filename));

    while (stream.read() != -1) {
      charCount++;
    }

    stream.close();

    return charCount;
  }
}
