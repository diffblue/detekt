package io.gitlab.arturbosch.detekt.core.config.validation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Map;
import org.junit.jupiter.api.Test;

class DeprecationsKtDiffblueTest {
  /**
  * Method under test: {@link DeprecationsKt#loadDeprecations()}
  */
  @Test
  void testLoadDeprecations() {
    // Arrange and Act
    Map<String, String> actualLoadDeprecationsResult = DeprecationsKt.loadDeprecations();

    // Assert
    assertEquals(27, actualLoadDeprecationsResult.size());
    assertEquals("Use `restrictToConfig` instead",
        actualLoadDeprecationsResult.get("potential-bugs>IgnoredReturnValue>restrictToAnnotatedMethods"));
    assertEquals("This configuration is ignored and will be removed in the future",
        actualLoadDeprecationsResult.get("naming>BooleanPropertyNaming>ignoreOverridden"));
    assertEquals("Rule migrated to `libraries` ruleset plugin",
        actualLoadDeprecationsResult.get("style>ForbiddenPublicDataClass"));
    assertEquals("Use `ignoreAnnotated` instead",
        actualLoadDeprecationsResult.get("style>UnnecessaryAbstractClass>excludeAnnotatedClasses"));
    assertEquals("Use `ignoreOverridden` instead",
        actualLoadDeprecationsResult.get("naming>FunctionParameterNaming>ignoreOverriddenFunctions"));
    assertEquals("`continuationIndentSize` is ignored by KtLint and will have no effect",
        actualLoadDeprecationsResult.get("formatting>Indentation>continuationIndentSize"));
    assertEquals("Use `ignoreOverridden` instead",
        actualLoadDeprecationsResult.get("empty-blocks>EmptyFunctionBlock>ignoreOverriddenFunctions"));
    assertEquals("Use `acceptableLength` instead",
        actualLoadDeprecationsResult.get("style>UnderscoresInNumericLiterals>acceptableDecimalLength"));
    assertEquals("Rule is split between `TrailingCommaOnCallSite` and `TrailingCommaOnDeclarationSite` now.",
        actualLoadDeprecationsResult.get("formatting>TrailingComma"));
    assertEquals("Rule migrated to `libraries` ruleset plugin",
        actualLoadDeprecationsResult.get("style>LibraryCodeMustSpecifyReturnType"));
    assertEquals("Use `BracesOnIfStatements` with `always` configuration instead",
        actualLoadDeprecationsResult.get("style>MandatoryBracesIfStatements"));
  }
}

