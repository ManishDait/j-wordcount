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
}
