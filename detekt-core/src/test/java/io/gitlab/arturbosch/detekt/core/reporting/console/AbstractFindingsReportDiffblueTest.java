package io.gitlab.arturbosch.detekt.core.reporting.console;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AbstractFindingsReportDiffblueTest {
  /**
  * Method under test: {@link AbstractFindingsReport#getPriority()}
  */
  @Test
  void testGetPriority() {
    // Arrange, Act and Assert
    assertEquals(40, (new FileBasedFindingsReport()).getPriority());
  }
}

