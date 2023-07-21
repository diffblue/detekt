package io.gitlab.arturbosch.detekt.generator;

import static org.junit.jupiter.api.Assertions.assertTrue;
import io.github.detekt.test.utils.NullPrintStream;
import io.github.detekt.test.utils.StringPrintStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class GeneratorDiffblueTest {
  /**
  * Method under test: {@link Generator#Generator(GeneratorArgs, PrintStream)}
  */
  @Test
  void testConstructor() {
    // Arrange
    GeneratorArgs arguments = new GeneratorArgs();
    arguments.setGenerateCustomRuleConfig(true);
    arguments.setHelp(true);

    // Act
    new Generator(arguments, new NullPrintStream());

    // Assert
    assertTrue(arguments.getGenerateCustomRuleConfig());
    assertTrue(arguments.getHelp());
  }

  /**
   * Method under test: {@link Generator#Generator(GeneratorArgs, PrintStream)}
   */
  @Test
  void testConstructor2() {
    // Arrange
    GeneratorArgs arguments = new GeneratorArgs();
    arguments.setGenerateCustomRuleConfig(true);
    arguments.setHelp(true);

    // Act
    new Generator(arguments, new StringPrintStream());

    // Assert
    assertTrue(arguments.getGenerateCustomRuleConfig());
    assertTrue(arguments.getHelp());
  }
}

