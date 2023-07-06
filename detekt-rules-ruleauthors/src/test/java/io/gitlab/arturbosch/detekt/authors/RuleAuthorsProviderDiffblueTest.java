package io.gitlab.arturbosch.detekt.authors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class RuleAuthorsProviderDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link RuleAuthorsProvider}
  *   <li>{@link RuleAuthorsProvider#getRuleSetId()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("ruleauthors", (new RuleAuthorsProvider()).getRuleSetId());
  }
}

