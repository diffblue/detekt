package io.gitlab.arturbosch.detekt.rules.style;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BracesOnWhenStatementsDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link BracesOnWhenStatements.BracePolicy#valueOf(String)}
  *   <li>{@link BracesOnWhenStatements.BracePolicy#getConfig()}
  *   <li>{@link BracesOnWhenStatements.BracePolicy#getMessage()}
  * </ul>
  */
  @Test
  void testBracePolicyValueOf() {
    // Arrange and Act
    BracesOnWhenStatements.BracePolicy actualValueOfResult = BracesOnWhenStatements.BracePolicy.valueOf("Always");

    // Assert
    assertEquals("always", actualValueOfResult.getConfig());
    assertEquals("Missing braces on this branch, add them.", actualValueOfResult.getMessage());
  }
}

