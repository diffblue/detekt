package io.gitlab.arturbosch.detekt.generator.collection.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class InvalidCodeExampleDocumentationExceptionDiffblueTest {
  /**
  * Method under test: {@link InvalidCodeExampleDocumentationException#InvalidCodeExampleDocumentationException(String)}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    InvalidCodeExampleDocumentationException actualInvalidCodeExampleDocumentationException = new InvalidCodeExampleDocumentationException(
        "Rule Name");

    // Assert
    assertNull(actualInvalidCodeExampleDocumentationException.getCause());
    assertEquals(0, actualInvalidCodeExampleDocumentationException.getSuppressed().length);
    assertEquals("Invalid rule documentation for noncompliant and compliant code examples in Rule Name.",
        actualInvalidCodeExampleDocumentationException.getMessage());
    assertEquals("Invalid rule documentation for noncompliant and compliant code examples in Rule Name.",
        actualInvalidCodeExampleDocumentationException.getLocalizedMessage());
  }
}

