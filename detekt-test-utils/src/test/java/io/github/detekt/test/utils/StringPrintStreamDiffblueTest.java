package io.github.detekt.test.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class StringPrintStreamDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link StringPrintStream#StringPrintStream()}
  *   <li>{@link StringPrintStream#toString()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("", (new StringPrintStream()).toString());
  }
}

