package io.github.detekt.metrics;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class CyclomaticComplexityDiffblueTest {
  /**
  * Method under test: {@link CyclomaticComplexity.Config#Config(boolean, boolean, Set)}
  */
  @Test
  void testConfigConstructor() {
    // Arrange and Act
    CyclomaticComplexity.Config actualConfig = new CyclomaticComplexity.Config(true, true, new HashSet<>());

    // Assert
    assertTrue(actualConfig.getIgnoreNestingFunctions());
    assertTrue(actualConfig.getNestingFunctions().isEmpty());
    assertTrue(actualConfig.getIgnoreSimpleWhenEntries());
  }
}

