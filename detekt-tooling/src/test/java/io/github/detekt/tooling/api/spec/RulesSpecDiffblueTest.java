package io.github.detekt.tooling.api.spec;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import kotlin.Pair;
import org.junit.jupiter.api.Test;

class RulesSpecDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link RulesSpec.MaxIssuePolicy.AllowAmount#AllowAmount(int)}
  *   <li>{@link RulesSpec.MaxIssuePolicy.AllowAmount#getAmount()}
  * </ul>
  */
  @Test
  void testMaxIssuePolicy_AllowAmountConstructor() {
    // Arrange, Act and Assert
    assertEquals(10, (new RulesSpec.MaxIssuePolicy.AllowAmount(10)).getAmount());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link RulesSpec.RunPolicy.RestrictToSingleRule#RestrictToSingleRule(Pair)}
   *   <li>{@link RulesSpec.RunPolicy.RestrictToSingleRule#getId()}
   * </ul>
   */
  @Test
  void testRunPolicy_RestrictToSingleRuleConstructor() {
    // Arrange
    Pair<String, String> id = new Pair<>("First", "Second");

    // Act and Assert
    assertSame(id, (new RulesSpec.RunPolicy.RestrictToSingleRule(id)).getId());
  }

  /**
   * Method under test: {@link RulesSpec.RunPolicy.RestrictToSingleRule#RestrictToSingleRule(Pair)}
   */
  @Test
  void testRunPolicy_RestrictToSingleRuleConstructor2() {
    // Arrange
    Pair<String, String> id = new Pair<>("First", "Second");

    // Act and Assert
    assertSame(id, (new RulesSpec.RunPolicy.RestrictToSingleRule(id)).getId());
  }
}

