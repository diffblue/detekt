package io.gitlab.arturbosch.detekt.generator.out;

import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.detekt.test.utils.NullPrintStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class PropertiesWriterDiffblueTest {
  /**
  * Method under test: {@link PropertiesWriter#PropertiesWriter(PrintStream)}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("properties", (new PropertiesWriter(new NullPrintStream())).getEnding());
  }
}

