package io.github.detekt.report.html;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class HtmlOutputReportDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link HtmlOutputReport}
  *   <li>{@link HtmlOutputReport#getEnding()}
  *   <li>{@link HtmlOutputReport#getName()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    HtmlOutputReport actualHtmlOutputReport = new HtmlOutputReport();

    // Assert
    assertEquals("html", actualHtmlOutputReport.getEnding());
    assertEquals("HTML report", actualHtmlOutputReport.getName());
  }
}

