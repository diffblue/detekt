package io.gitlab.arturbosch.detekt.formatting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FormattingProviderDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link FormattingProvider}
  *   <li>{@link FormattingProvider#getRuleSetId()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("formatting", (new FormattingProvider()).getRuleSetId());
  }
}

