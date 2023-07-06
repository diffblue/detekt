package io.gitlab.arturbosch.detekt.api.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import io.gitlab.arturbosch.detekt.api.Config;
import io.gitlab.arturbosch.detekt.test.TestConfig;
import org.junit.jupiter.api.Test;

class RuleSetConfigPropertyDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link RuleSetConfigProperty#RuleSetConfigProperty(String, Object)}
  *   <li>{@link RuleSetConfigProperty#getKey()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("Key", (new RuleSetConfigProperty<>("Key", "Default Value")).getKey());
  }

  /**
   * Method under test: {@link RuleSetConfigProperty#RuleSetConfigProperty(String, Object)}
   */
  @Test
  void testConstructor2() {
    // Arrange and Act
    RuleSetConfigProperty<Object> actualRuleSetConfigProperty = new RuleSetConfigProperty<>("Key", "Default Value");

    // Assert
    assertEquals("Default Value", actualRuleSetConfigProperty.getDefaultValue());
    assertEquals("Key", actualRuleSetConfigProperty.getKey());
  }

  /**
   * Method under test: {@link RuleSetConfigProperty#value(Config)}
   */
  @Test
  void testValue() {
    // Arrange
    RuleSetConfigProperty<Object> ruleSetConfigProperty = new RuleSetConfigProperty<>("Key", "Default Value");

    // Act and Assert
    assertEquals("Default Value", ruleSetConfigProperty.value(new TestConfig()));
  }
}

