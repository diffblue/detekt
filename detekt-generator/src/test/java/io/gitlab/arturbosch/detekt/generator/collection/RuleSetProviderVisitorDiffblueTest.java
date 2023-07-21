package io.gitlab.arturbosch.detekt.generator.collection;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class RuleSetProviderVisitorDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link RuleSetProviderVisitor}
  *   <li>{@link RuleSetProviderVisitor#setContainsRuleSetProvider(boolean)}
  *   <li>{@link RuleSetProviderVisitor#getContainsRuleSetProvider()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    RuleSetProviderVisitor actualRuleSetProviderVisitor = new RuleSetProviderVisitor();
    actualRuleSetProviderVisitor.setContainsRuleSetProvider(true);

    // Assert
    assertTrue(actualRuleSetProviderVisitor.getContainsRuleSetProvider());
  }

  /**
   * Method under test: default or parameterless constructor of {@link RuleSetProviderVisitor}
   */
  @Test
  void testConstructor2() {
    // Arrange, Act and Assert
    assertFalse((new RuleSetProviderVisitor()).getContainsRuleSetProvider());
  }
}

