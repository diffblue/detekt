package io.gitlab.arturbosch.detekt.core.reporting.console;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class NotificationReportDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link NotificationReport}
  *   <li>{@link NotificationReport#getPriority()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(-2147483647, (new NotificationReport()).getPriority());
  }
}

