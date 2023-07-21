package io.gitlab.arturbosch.detekt.rules.bugs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PotentialBugProviderDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link PotentialBugProvider}
  *   <li>{@link PotentialBugProvider#getRuleSetId()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("potential-bugs", (new PotentialBugProvider()).getRuleSetId());
  }
}

