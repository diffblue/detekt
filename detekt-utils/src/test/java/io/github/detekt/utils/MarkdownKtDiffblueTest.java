package io.github.detekt.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MarkdownKtDiffblueTest {
  /**
  * Method under test: {@link MarkdownKt#emptyLine(MarkdownContent)}
  */
  @Test
  void testEmptyLine() {
    // Arrange
    MarkdownContent $this$emptyLine = new MarkdownContent();

    // Act
    MarkdownKt.emptyLine($this$emptyLine);

    // Assert that nothing has changed
    assertEquals("", $this$emptyLine.component1());
  }
}

