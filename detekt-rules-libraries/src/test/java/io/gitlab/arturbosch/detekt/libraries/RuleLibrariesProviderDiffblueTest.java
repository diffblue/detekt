package io.gitlab.arturbosch.detekt.libraries;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class RuleLibrariesProviderDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link RuleLibrariesProvider}
  *   <li>{@link RuleLibrariesProvider#getRuleSetId()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("libraries", (new RuleLibrariesProvider()).getRuleSetId());
  }
}

