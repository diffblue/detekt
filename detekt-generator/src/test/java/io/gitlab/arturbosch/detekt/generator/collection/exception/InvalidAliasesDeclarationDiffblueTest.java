package io.gitlab.arturbosch.detekt.generator.collection.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class InvalidAliasesDeclarationDiffblueTest {
  /**
  * Method under test: default or parameterless constructor of {@link InvalidAliasesDeclaration}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    InvalidAliasesDeclaration actualInvalidAliasesDeclaration = new InvalidAliasesDeclaration();

    // Assert
    assertNull(actualInvalidAliasesDeclaration.getCause());
    assertEquals(0, actualInvalidAliasesDeclaration.getSuppressed().length);
    assertEquals(
        "Invalid aliases declaration. Example: override val defaultRuleIdAliases = setOf(\"Name1\", \"Name2\")",
        actualInvalidAliasesDeclaration.getMessage());
    assertEquals(
        "Invalid aliases declaration. Example: override val defaultRuleIdAliases = setOf(\"Name1\", \"Name2\")",
        actualInvalidAliasesDeclaration.getLocalizedMessage());
  }
}

