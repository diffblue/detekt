package io.gitlab.arturbosch.detekt.rules.style;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.gitlab.arturbosch.detekt.api.Debt;
import io.gitlab.arturbosch.detekt.api.Issue;
import io.gitlab.arturbosch.detekt.api.Severity;
import kotlin.text.Regex;
import org.junit.jupiter.api.Test;

class UnusedParameterVisitorDiffblueTest {
  /**
  * Method under test: {@link UnusedParameterVisitor#UnusedParameterVisitor(Regex)}
  */
  @Test
  void testConstructor() {
    // Arrange
    Regex allowedNames = new Regex("Pattern");

    // Act
    new UnusedParameterVisitor(allowedNames);

    // Assert
    assertTrue(allowedNames.getOptions().isEmpty());
    assertEquals("Pattern", allowedNames.getPattern());
  }

  /**
   * Method under test: {@link UnusedParameterVisitor#getUnusedReports(Issue)}
   */
  @Test
  void testGetUnusedReports() {
    // Arrange
    UnusedParameterVisitor unusedParameterVisitor = new UnusedParameterVisitor(new Regex("Pattern"));

    // Act and Assert
    assertTrue(unusedParameterVisitor
        .getUnusedReports(
            new Issue("Id", Severity.CodeSmell, "The characteristics of someone or something", new Debt(1, 1, 1)))
        .isEmpty());
  }
}

