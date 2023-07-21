package io.gitlab.arturbosch.detekt.api.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import kotlin.collections.EmptySet;
import org.junit.jupiter.api.Test;

class CommaSeparatedPatternDiffblueTest {
  /**
  * Method under test: {@link CommaSeparatedPattern#CommaSeparatedPattern(String, String)}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(2, (new CommaSeparatedPattern("Text", "Delimiters")).mapToRegex().size());
    assertTrue((new CommaSeparatedPattern("foo", "foo")).mapToRegex() instanceof EmptySet);
  }

  /**
   * Method under test: {@link CommaSeparatedPattern#mapToRegex()}
   */
  @Test
  void testMapToRegex() {
    // Arrange, Act and Assert
    assertEquals(2, (new CommaSeparatedPattern("Text", "Delimiters")).mapToRegex().size());
  }
}

