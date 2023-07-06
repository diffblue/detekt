package io.gitlab.arturbosch.detekt.rules.complexity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ComplexityProviderDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link ComplexityProvider}
  *   <li>{@link ComplexityProvider#getRuleSetId()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("complexity", (new ComplexityProvider()).getRuleSetId());
  }
}

