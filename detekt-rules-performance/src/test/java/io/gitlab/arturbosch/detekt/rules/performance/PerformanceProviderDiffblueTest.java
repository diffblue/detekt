package io.gitlab.arturbosch.detekt.rules.performance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PerformanceProviderDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link PerformanceProvider}
  *   <li>{@link PerformanceProvider#getRuleSetId()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("performance", (new PerformanceProvider()).getRuleSetId());
  }
}

