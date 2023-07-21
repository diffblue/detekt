package io.gitlab.arturbosch.detekt.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class RuleSetDiffblueTest {
  /**
  * Method under test: {@link RuleSet#RuleSet(String, List)}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    RuleSet actualRuleSet = new RuleSet("U-U-U", new ArrayList<>());

    // Assert
    assertEquals("U-U-U", actualRuleSet.getId());
    assertTrue(actualRuleSet.getRules().isEmpty());
  }
}

