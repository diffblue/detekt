package io.gitlab.arturbosch.detekt.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class HandledArgumentViolationDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link HandledArgumentViolation#HandledArgumentViolation(String, String)}
  *   <li>{@link HandledArgumentViolation#getUsageText()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("Usage Text",
        (new HandledArgumentViolation("Not all who wander are lost", "Usage Text")).getUsageText());
    assertEquals("Usage Text",
        (new HandledArgumentViolation("Not all who wander are lost", "Usage Text")).getUsageText());
  }
}

