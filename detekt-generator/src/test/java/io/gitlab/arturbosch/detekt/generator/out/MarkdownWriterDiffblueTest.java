package io.gitlab.arturbosch.detekt.generator.out;

import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.detekt.test.utils.NullPrintStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MarkdownWriterDiffblueTest {
  /**
  * Method under test: {@link MarkdownWriter#MarkdownWriter(PrintStream)}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("md", (new MarkdownWriter(new NullPrintStream())).getEnding());
  }
}

