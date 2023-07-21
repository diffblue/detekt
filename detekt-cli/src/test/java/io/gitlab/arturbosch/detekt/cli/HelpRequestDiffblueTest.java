package io.gitlab.arturbosch.detekt.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class HelpRequestDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link HelpRequest#HelpRequest(String)}
  *   <li>{@link HelpRequest#getUsageText()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("Usage Text", (new HelpRequest("Usage Text")).getUsageText());
    assertEquals("Usage Text", (new HelpRequest("Usage Text")).getUsageText());
  }
}

