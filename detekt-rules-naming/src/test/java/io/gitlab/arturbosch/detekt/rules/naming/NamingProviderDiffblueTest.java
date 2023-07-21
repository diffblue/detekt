package io.gitlab.arturbosch.detekt.rules.naming;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class NamingProviderDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link NamingProvider}
  *   <li>{@link NamingProvider#getRuleSetId()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("naming", (new NamingProvider()).getRuleSetId());
  }
}

