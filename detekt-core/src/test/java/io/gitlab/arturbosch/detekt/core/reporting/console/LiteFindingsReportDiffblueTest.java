package io.gitlab.arturbosch.detekt.core.reporting.console;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class LiteFindingsReportDiffblueTest {
  /**
  * Method under test: default or parameterless constructor of {@link LiteFindingsReport}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(40, (new LiteFindingsReport()).getPriority());
  }
}

