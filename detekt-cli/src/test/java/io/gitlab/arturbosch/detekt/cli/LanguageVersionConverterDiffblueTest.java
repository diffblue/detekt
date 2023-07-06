package io.gitlab.arturbosch.detekt.cli;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class LanguageVersionConverterDiffblueTest {
  /**
  * Method under test: {@link LanguageVersionConverter#convert(String)}
  */
  @Test
  void testConvert() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new LanguageVersionConverter()).convert("42"));
    assertThrows(IllegalArgumentException.class, () -> (new LanguageVersionConverter()).convert("foo"));
  }
}

