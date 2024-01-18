package io.github.manishdait.ccwc;

import java.util.Scanner;

import java.io.File;
import java.io.FileInputStream;
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
}
