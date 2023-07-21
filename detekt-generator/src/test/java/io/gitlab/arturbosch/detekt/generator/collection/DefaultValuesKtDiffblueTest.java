package io.gitlab.arturbosch.detekt.generator.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DefaultValuesKtDiffblueTest {
  /**
  * Method under test: {@link DefaultValuesKt#createDefaultValueIfLiteral(String)}
  */
  @Test
  void testCreateDefaultValueIfLiteral() {
    // Arrange, Act and Assert
    assertEquals("", DefaultValuesKt.createDefaultValueIfLiteral("\"\"").getPlainValue());
  }
}

