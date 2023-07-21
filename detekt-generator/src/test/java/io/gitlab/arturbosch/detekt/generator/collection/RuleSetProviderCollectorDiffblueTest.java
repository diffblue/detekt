package io.gitlab.arturbosch.detekt.generator.collection;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class RuleSetProviderCollectorDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link RuleSetProviderCollector}
  *   <li>{@link RuleSetProviderCollector#getItems()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new RuleSetProviderCollector()).getItems().isEmpty());
    assertTrue((new RuleSetProviderCollector()).getItems().isEmpty());
  }
}

