package io.gitlab.arturbosch.detekt.generator.collection.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class InvalidDocumentationExceptionDiffblueTest {
  /**
  * Method under test: {@link InvalidDocumentationException#InvalidDocumentationException(String)}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    InvalidDocumentationException actualInvalidDocumentationException = new InvalidDocumentationException(
        "An error occurred");

    // Assert
    assertNull(actualInvalidDocumentationException.getCause());
    assertEquals(0, actualInvalidDocumentationException.getSuppressed().length);
    assertEquals("An error occurred", actualInvalidDocumentationException.getMessage());
    assertEquals("An error occurred", actualInvalidDocumentationException.getLocalizedMessage());
  }
}

