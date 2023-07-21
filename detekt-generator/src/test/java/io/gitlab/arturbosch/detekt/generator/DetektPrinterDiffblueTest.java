package io.gitlab.arturbosch.detekt.generator;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class DetektPrinterDiffblueTest {
  /**
  * Method under test: {@link DetektPrinter#DetektPrinter(GeneratorArgs)}
  */
  @Test
  void testConstructor() {
    // Arrange
    GeneratorArgs arguments = new GeneratorArgs();
    arguments.setGenerateCustomRuleConfig(true);
    arguments.setHelp(true);

    // Act
    new DetektPrinter(arguments);

    // Assert
    assertTrue(arguments.getGenerateCustomRuleConfig());
    assertTrue(arguments.getHelp());
  }
}

