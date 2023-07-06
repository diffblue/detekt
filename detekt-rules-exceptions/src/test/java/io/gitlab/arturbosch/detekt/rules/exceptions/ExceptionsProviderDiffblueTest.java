package io.gitlab.arturbosch.detekt.rules.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ExceptionsProviderDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link ExceptionsProvider}
  *   <li>{@link ExceptionsProvider#getRuleSetId()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("exceptions", (new ExceptionsProvider()).getRuleSetId());
  }
}

