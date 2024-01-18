package io.github.manishdait.ccwc;

import java.util.Scanner;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
  public static void main( String[] args ) throws IOException {}

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
