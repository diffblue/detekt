package io.gitlab.arturbosch.detekt.rules.style;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BracesOnIfStatementsDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link BracesOnIfStatements.BracePolicy#valueOf(String)}
  *   <li>{@link BracesOnIfStatements.BracePolicy#getConfig()}
  * </ul>
  */
  @Test
  void testBracePolicyValueOf() {
    // Arrange, Act and Assert
    assertEquals("always", BracesOnIfStatements.BracePolicy.valueOf("Always").getConfig());
  }
}

