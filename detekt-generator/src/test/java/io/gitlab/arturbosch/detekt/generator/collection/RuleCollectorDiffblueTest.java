package io.gitlab.arturbosch.detekt.generator.collection;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class RuleCollectorDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link RuleCollector}
  *   <li>{@link RuleCollector#getItems()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new RuleCollector()).getItems().isEmpty());
    assertTrue((new RuleCollector()).getItems().isEmpty());
  }
}

