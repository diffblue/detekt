package io.gitlab.arturbosch.detekt.core.util;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PerformanceMonitorDiffblueTest {
  /**
   * Method under test: {@link PerformanceMonitor#allFinished()}
   */
  @Test
  void testAllFinished() {
    // Arrange, Act and Assert
    assertTrue((new PerformanceMonitor()).allFinished().isEmpty());
  }

  /**
  * Method under test: default or parameterless constructor of {@link PerformanceMonitor}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new PerformanceMonitor()).allFinished().isEmpty());
  }

  /**
   * Method under test: {@link PerformanceMonitor#finish(PerformanceMonitor.Phase)}
   */
  @Test
  void testFinish() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> (new PerformanceMonitor()).finish(PerformanceMonitor.Phase.LoadConfig));
  }

  /**
   * Method under test: {@link PerformanceMonitor#start(PerformanceMonitor.Phase)}
   */
  @Test
  void testStart() {
    // Arrange
    PerformanceMonitor performanceMonitor = new PerformanceMonitor();

    // Act
    performanceMonitor.start(PerformanceMonitor.Phase.LoadConfig);

    // Assert
    assertTrue(performanceMonitor.allFinished().isEmpty());
  }
}

