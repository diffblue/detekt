package io.gitlab.arturbosch.detekt.generator.collection.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class InvalidIssueDeclarationDiffblueTest {
  /**
  * Method under test: {@link InvalidIssueDeclaration#InvalidIssueDeclaration(String)}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    InvalidIssueDeclaration actualInvalidIssueDeclaration = new InvalidIssueDeclaration("Attribute Name");

    // Assert
    assertNull(actualInvalidIssueDeclaration.getCause());
    assertEquals(0, actualInvalidIssueDeclaration.getSuppressed().length);
    assertEquals("Invalid issue declaration attribute Attribute Name.", actualInvalidIssueDeclaration.getMessage());
    assertEquals("Invalid issue declaration attribute Attribute Name.",
        actualInvalidIssueDeclaration.getLocalizedMessage());
  }
}

