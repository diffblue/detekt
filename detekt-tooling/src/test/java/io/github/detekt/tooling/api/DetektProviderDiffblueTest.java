package io.github.detekt.tooling.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DetektProviderDiffblueTest {
  /**
  * Method under test: {@link DetektProvider.DefaultImpls#getPriority(DetektProvider)}
  */
  @Test
  void testDefaultImplsGetPriority() {
    // Arrange, Act and Assert
    assertEquals(-1, DetektProvider.DefaultImpls.getPriority(new PrioritizedProvider()));
  }
}

