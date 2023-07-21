package io.gitlab.arturbosch.detekt.api.internal;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class ValidationKtDiffblueTest {
  /**
  * Method under test: {@link ValidationKt#validateIdentifier(String)}
  */
  @Test
  void testValidateIdentifier() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ValidationKt.validateIdentifier("42"));
  }
}

