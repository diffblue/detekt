package io.gitlab.arturbosch.detekt.cli.runners;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.StringWriter;
import org.junit.jupiter.api.Test;

class VersionPrinterDiffblueTest {
  /**
  * Method under test: {@link VersionPrinter#VersionPrinter(Appendable)}
  */
  @Test
  void testConstructor() {
    // Arrange
    StringWriter outputPrinter = new StringWriter();

    // Act
    (new VersionPrinter(outputPrinter)).execute();

    // Assert
    StringBuffer buffer = outputPrinter.getBuffer();
    assertEquals(Short.SIZE, buffer.capacity());
    assertEquals(6, buffer.length());
  }
}

