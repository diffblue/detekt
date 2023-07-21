package io.github.detekt.report.xml;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class XmlOutputReportDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link XmlOutputReport}
  *   <li>{@link XmlOutputReport#getEnding()}
  *   <li>{@link XmlOutputReport#getName()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    XmlOutputReport actualXmlOutputReport = new XmlOutputReport();

    // Assert
    assertEquals("xml", actualXmlOutputReport.getEnding());
    assertEquals("Checkstyle XML report", actualXmlOutputReport.getName());
  }
}

