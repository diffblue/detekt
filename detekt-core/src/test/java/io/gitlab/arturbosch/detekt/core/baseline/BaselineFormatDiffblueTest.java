package io.gitlab.arturbosch.detekt.core.baseline;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class BaselineFormatDiffblueTest {
  /**
   * Method under test: {@link BaselineFormat.InvalidState#InvalidState(String, Throwable)}
   */
  @Test
  void testInvalidStateConstructor() {
    // Arrange
    Throwable error = new Throwable();

    // Act and Assert
    assertSame((new BaselineFormat.InvalidState("Msg", error)).getCause(), error);
  }

  /**
  * Method under test: {@link BaselineFormat#of(Set, Set)}
  */
  @Test
  void testOf() {
    // Arrange
    BaselineFormat baselineFormat = new BaselineFormat();
    HashSet<String> manuallySuppressedIssues = new HashSet<>();

    // Act
    DefaultBaseline actualOfResult = baselineFormat.of(manuallySuppressedIssues, new HashSet<>());

    // Assert
    assertTrue(actualOfResult.component1().isEmpty());
    assertTrue(actualOfResult.getCurrentIssues().isEmpty());
  }
}

