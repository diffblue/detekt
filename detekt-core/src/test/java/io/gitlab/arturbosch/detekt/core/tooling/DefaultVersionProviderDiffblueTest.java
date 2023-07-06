package io.gitlab.arturbosch.detekt.core.tooling;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DefaultVersionProviderDiffblueTest {
  /**
  * Method under test: {@link DefaultVersionProvider#current()}
  */
  @Test
  void testCurrent() {
    // Arrange, Act and Assert
    assertEquals("1.23.0", (new DefaultVersionProvider()).current());
  }
}

