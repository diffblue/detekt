package io.gitlab.arturbosch.detekt.core.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.gitlab.arturbosch.detekt.api.PropertiesAware;
import io.gitlab.arturbosch.detekt.core.settings.PropertiesFacade;
import org.junit.jupiter.api.Test;

class PerformanceMonitorKtDiffblueTest {
  /**
  * Method under test: {@link PerformanceMonitorKt#getOrCreateMonitor(PropertiesAware)}
  */
  @Test
  void testGetOrCreateMonitor() {
    // Arrange
    PropertiesFacade $this$getOrCreateMonitor = new PropertiesFacade();

    // Act and Assert
    assertTrue(PerformanceMonitorKt.getOrCreateMonitor($this$getOrCreateMonitor).allFinished().isEmpty());
    assertEquals(1, $this$getOrCreateMonitor.getProperties().size());
  }
}

