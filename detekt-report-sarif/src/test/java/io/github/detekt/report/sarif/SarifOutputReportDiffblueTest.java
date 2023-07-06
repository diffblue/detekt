package io.github.detekt.report.sarif;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SarifOutputReportDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link SarifOutputReport}
  *   <li>{@link SarifOutputReport#getEnding()}
  *   <li>{@link SarifOutputReport#getId()}
  *   <li>{@link SarifOutputReport#getName()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    SarifOutputReport actualSarifOutputReport = new SarifOutputReport();

    // Assert
    assertEquals("sarif", actualSarifOutputReport.getEnding());
    assertEquals("sarif", actualSarifOutputReport.getId());
    assertEquals("SARIF: a standard format for the output of static analysis tools", actualSarifOutputReport.getName());
  }

  /**
   * Method under test: default or parameterless constructor of {@link SarifOutputReport}
   */
  @Test
  void testConstructor2() {
    // Arrange and Act
    SarifOutputReport actualSarifOutputReport = new SarifOutputReport();

    // Assert
    assertEquals("sarif", actualSarifOutputReport.getEnding());
    assertEquals("SARIF: a standard format for the output of static analysis tools", actualSarifOutputReport.getName());
    assertEquals("sarif", actualSarifOutputReport.getId());
  }
}

