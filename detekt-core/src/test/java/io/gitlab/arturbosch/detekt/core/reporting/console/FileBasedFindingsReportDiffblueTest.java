package io.gitlab.arturbosch.detekt.core.reporting.console;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FileBasedFindingsReportDiffblueTest {
  /**
  * Method under test: default or parameterless constructor of {@link FileBasedFindingsReport}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(40, (new FileBasedFindingsReport()).getPriority());
  }
}

