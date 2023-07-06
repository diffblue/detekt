package io.gitlab.arturbosch.detekt.rules.empty;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class EmptyCodeProviderDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link EmptyCodeProvider}
  *   <li>{@link EmptyCodeProvider#getRuleSetId()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("empty-blocks", (new EmptyCodeProvider()).getRuleSetId());
  }
}

