package io.gitlab.arturbosch.detekt.generator.collection;

import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

class RuleVisitorDiffblueTest {
  /**
  * Method under test: default or parameterless constructor of {@link RuleVisitor}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertFalse((new RuleVisitor()).getContainsRule());
  }
}

