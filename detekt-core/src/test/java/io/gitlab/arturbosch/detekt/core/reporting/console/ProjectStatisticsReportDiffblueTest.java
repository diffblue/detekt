package io.gitlab.arturbosch.detekt.core.reporting.console;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ProjectStatisticsReportDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link ProjectStatisticsReport}
  *   <li>{@link ProjectStatisticsReport#getPriority()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(10, (new ProjectStatisticsReport()).getPriority());
  }
}

