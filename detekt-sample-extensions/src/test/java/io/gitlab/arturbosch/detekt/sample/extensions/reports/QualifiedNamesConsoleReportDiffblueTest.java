package io.gitlab.arturbosch.detekt.sample.extensions.reports;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class QualifiedNamesConsoleReportDiffblueTest {
  /**
  * Method under test: default or parameterless constructor of {@link QualifiedNamesConsoleReport}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    QualifiedNamesConsoleReport actualQualifiedNamesConsoleReport = new QualifiedNamesConsoleReport();

    // Assert
    assertEquals("QualifiedNamesConsoleReport", actualQualifiedNamesConsoleReport.getId());
    assertEquals(-1, actualQualifiedNamesConsoleReport.getPriority());
  }
}

