package io.github.detekt.report.md;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MdOutputReportDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link MdOutputReport}
  *   <li>{@link MdOutputReport#getEnding()}
  *   <li>{@link MdOutputReport#getName()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    MdOutputReport actualMdOutputReport = new MdOutputReport();

    // Assert
    assertEquals("md", actualMdOutputReport.getEnding());
    assertEquals("Markdown report", actualMdOutputReport.getName());
  }
}

