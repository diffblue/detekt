package io.gitlab.arturbosch.detekt.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import kotlin.sequences.Sequence;
import kotlin.sequences.TransformingSequence;
import org.junit.jupiter.api.Test;

class SplitPatternKtDiffblueTest {
  /**
  * Method under test: {@link SplitPatternKt#commaSeparatedPattern(String, String[])}
  */
  @Test
  void testCommaSeparatedPattern() {
    // Arrange and Act
    Sequence<String> actualCommaSeparatedPatternResult = SplitPatternKt
        .commaSeparatedPattern("$this$commaSeparatedPattern", "Delimiters");
    actualCommaSeparatedPatternResult.iterator();

    // Assert
    assertTrue(actualCommaSeparatedPatternResult instanceof TransformingSequence);
  }

  /**
   * Method under test: {@link SplitPatternKt#commaSeparatedPattern(String, String[])}
   */
  @Test
  void testCommaSeparatedPattern2() {
    // Arrange and Act
    Sequence<String> actualCommaSeparatedPatternResult = SplitPatternKt.commaSeparatedPattern("foo", "foo");
    actualCommaSeparatedPatternResult.iterator();

    // Assert
    assertTrue(actualCommaSeparatedPatternResult instanceof TransformingSequence);
  }

  /**
   * Method under test: {@link SplitPatternKt#simplePatternToRegex(String)}
   */
  @Test
  void testSimplePatternToRegex() {
    // Arrange, Act and Assert
    assertEquals("\\..*", SplitPatternKt.simplePatternToRegex(".*").getPattern());
  }
}

