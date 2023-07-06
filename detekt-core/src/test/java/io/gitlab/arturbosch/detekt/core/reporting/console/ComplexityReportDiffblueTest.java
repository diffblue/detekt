package io.gitlab.arturbosch.detekt.core.reporting.console;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ComplexityReportDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link ComplexityReport}
  *   <li>{@link ComplexityReport#getPriority()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(20, (new ComplexityReport()).getPriority());
  }
}

