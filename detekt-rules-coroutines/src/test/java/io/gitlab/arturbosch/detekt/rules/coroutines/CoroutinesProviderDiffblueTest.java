package io.gitlab.arturbosch.detekt.rules.coroutines;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CoroutinesProviderDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link CoroutinesProvider}
  *   <li>{@link CoroutinesProvider#getRuleSetId()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("coroutines", (new CoroutinesProvider()).getRuleSetId());
  }
}

