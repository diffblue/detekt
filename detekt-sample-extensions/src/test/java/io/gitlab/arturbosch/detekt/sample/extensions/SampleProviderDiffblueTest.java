package io.gitlab.arturbosch.detekt.sample.extensions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SampleProviderDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link SampleProvider}
  *   <li>{@link SampleProvider#getRuleSetId()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("sample", (new SampleProvider()).getRuleSetId());
  }
}

