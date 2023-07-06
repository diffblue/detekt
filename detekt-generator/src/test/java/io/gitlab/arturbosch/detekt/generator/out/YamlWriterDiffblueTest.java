package io.gitlab.arturbosch.detekt.generator.out;

import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.detekt.test.utils.NullPrintStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class YamlWriterDiffblueTest {
  /**
  * Method under test: {@link YamlWriter#YamlWriter(PrintStream)}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("yml", (new YamlWriter(new NullPrintStream())).getEnding());
  }
}

