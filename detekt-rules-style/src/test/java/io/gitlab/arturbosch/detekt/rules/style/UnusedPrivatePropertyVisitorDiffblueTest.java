package io.gitlab.arturbosch.detekt.rules.style;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.gitlab.arturbosch.detekt.api.Debt;
import io.gitlab.arturbosch.detekt.api.Issue;
import io.gitlab.arturbosch.detekt.api.Severity;
import kotlin.text.Regex;
import org.junit.jupiter.api.Test;

class UnusedPrivatePropertyVisitorDiffblueTest {
  /**
  * Method under test: {@link UnusedPrivatePropertyVisitor#UnusedPrivatePropertyVisitor(Regex)}
  */
  @Test
  void testConstructor() {
    // Arrange
    Regex allowedNames = new Regex("Pattern");

    // Act
    new UnusedPrivatePropertyVisitor(allowedNames);

    // Assert
    assertTrue(allowedNames.getOptions().isEmpty());
    assertEquals("Pattern", allowedNames.getPattern());
  }

  /**
   * Method under test: {@link UnusedPrivatePropertyVisitor#getUnusedReports(Issue)}
   */
  @Test
  void testGetUnusedReports() {
    // Arrange
    UnusedPrivatePropertyVisitor unusedPrivatePropertyVisitor = new UnusedPrivatePropertyVisitor(new Regex("Pattern"));

    // Act and Assert
    assertTrue(unusedPrivatePropertyVisitor
        .getUnusedReports(
            new Issue("Id", Severity.CodeSmell, "The characteristics of someone or something", new Debt(1, 1, 1)))
        .isEmpty());
  }
}

