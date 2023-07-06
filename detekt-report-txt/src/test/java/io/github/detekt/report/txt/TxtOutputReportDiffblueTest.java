package io.github.detekt.report.txt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TxtOutputReportDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link TxtOutputReport}
  *   <li>{@link TxtOutputReport#getEnding()}
  *   <li>{@link TxtOutputReport#getName()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    TxtOutputReport actualTxtOutputReport = new TxtOutputReport();

    // Assert
    assertEquals("txt", actualTxtOutputReport.getEnding());
    assertEquals("plain text report", actualTxtOutputReport.getName());
  }
}

