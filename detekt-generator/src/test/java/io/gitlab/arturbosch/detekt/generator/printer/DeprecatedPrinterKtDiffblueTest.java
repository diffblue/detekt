package io.gitlab.arturbosch.detekt.generator.printer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

class DeprecatedPrinterKtDiffblueTest {
  /**
  * Method under test: {@link DeprecatedPrinterKt#migratedRules()}
  */
  @Test
  void testMigratedRules() {
    // Arrange and Act
    List<String> actualMigratedRulesResult = DeprecatedPrinterKt.migratedRules();

    // Assert
    assertEquals(6, actualMigratedRulesResult.size());
    assertEquals(
        "formatting>TrailingComma=Rule is split between `TrailingCommaOnCallSite` and `TrailingCommaOnDeclarationSite`"
            + " now.",
        actualMigratedRulesResult.get(0));
    assertEquals("style>ForbiddenPublicDataClass=Rule migrated to `libraries` ruleset plugin",
        actualMigratedRulesResult.get(1));
    assertEquals("style>LibraryCodeMustSpecifyReturnType=Rule migrated to `libraries` ruleset plugin",
        actualMigratedRulesResult.get(2));
    assertEquals("style>LibraryEntitiesShouldNotBePublic=Rule migrated to `libraries` ruleset plugin",
        actualMigratedRulesResult.get(3));
    assertEquals("style>MandatoryBracesIfStatements=Use `BracesOnIfStatements` with `always` configuration instead",
        actualMigratedRulesResult.get(4));
    assertEquals(
        "complexity>ComplexMethod=Rule is renamed to `CyclomaticComplexMethod` to distinguish between Cyclomatic"
            + " Complexity and Cognitive Complexity",
        actualMigratedRulesResult.get(5));
  }
}

