package io.gitlab.arturbosch.detekt.core.reporting.console;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FindingsReportDiffblueTest {
  /**
  * Method under test: default or parameterless constructor of {@link FindingsReport}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(40, (new FindingsReport()).getPriority());
  }
}

