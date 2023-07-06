package io.gitlab.arturbosch.detekt.sample.extensions.reports;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class QualifiedNamesOutputReportDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link QualifiedNamesOutputReport}
  *   <li>{@link QualifiedNamesOutputReport#getEnding()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("txt", (new QualifiedNamesOutputReport()).getEnding());
  }
}

