package io.gitlab.arturbosch.detekt.core.tooling;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DefaultDetektProviderDiffblueTest {
  /**
  * Method under test: default or parameterless constructor of {@link DefaultDetektProvider}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(-1, (new DefaultDetektProvider()).getPriority());
  }

  /**
   * Method under test: {@link DefaultDetektProvider#getPriority()}
   */
  @Test
  void testGetPriority() {
    // Arrange, Act and Assert
    assertEquals(-1, (new DefaultDetektProvider()).getPriority());
  }
}

