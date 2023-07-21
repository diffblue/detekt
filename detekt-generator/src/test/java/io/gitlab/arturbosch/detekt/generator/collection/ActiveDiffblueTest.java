package io.gitlab.arturbosch.detekt.generator.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.gitlab.arturbosch.detekt.generator.collection.exception.InvalidDocumentationException;
import org.junit.jupiter.api.Test;

class ActiveDiffblueTest {
  /**
  * Method under test: {@link Active#Active(String)}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertThrows(InvalidDocumentationException.class, () -> new Active("Since"));
  }

  /**
   * Method under test: {@link Active#Active(String)}
   */
  @Test
  void testConstructor2() {
    // Arrange and Act
    Active actualActive = new Active("9.9U9");

    // Assert
    assertEquals("9.9U9", actualActive.component1());
    assertTrue(actualActive.getActive());
  }
}

