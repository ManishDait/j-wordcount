package io.github.manishdait.ccwc;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class WordCountTest  {
  @Test
  public void testByteCount() throws IOException {
    long expected = 342190;
    assertEquals(expected, WordCount.countByte("test.txt"));
  }

  @Test
  public void testLineCount() throws IOException {
    long expected = 7145;
    assertEquals(expected, WordCount.countLine("test.txt"));
  }

  @Test
  public void testWordCount() throws IOException {
    long expected = 58164;
    assertEquals(expected, WordCount.countWord("test.txt"));
  }

  @Test
  public void testCharCount() throws IOException {
    long expected = 339292;
    assertEquals(expected, WordCount.countChar("test.txt"));
  }
}
