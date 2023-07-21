package io.gitlab.arturbosch.detekt.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MultipleClasspathResourceConverterDiffblueTest {
  /**
  * Method under test: {@link MultipleClasspathResourceConverter#convert(String)}
  */
  @Test
  void testConvert() {
    // Arrange, Act and Assert
    assertEquals(2, (new MultipleClasspathResourceConverter()).convert(JunkKt.SEPARATOR_COMMA).size());
  }
}

