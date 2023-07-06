package io.gitlab.arturbosch.detekt.rules;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class StringExtensionsKtDiffblueTest {
  /**
  * Method under test: {@link StringExtensionsKt#lastArgumentMatchesKotlinReferenceUrlSyntax(String)}
  */
  @Test
  void testLastArgumentMatchesKotlinReferenceUrlSyntax() {
    // Arrange, Act and Assert
    assertFalse(StringExtensionsKt.lastArgumentMatchesKotlinReferenceUrlSyntax("https://example.org/example"));
    assertFalse(StringExtensionsKt.lastArgumentMatchesKotlinReferenceUrlSyntax("foo"));
    assertTrue(StringExtensionsKt.lastArgumentMatchesKotlinReferenceUrlSyntax("[U]"));
  }

  /**
   * Method under test: {@link StringExtensionsKt#lastArgumentMatchesMarkdownUrlSyntax(String)}
   */
  @Test
  void testLastArgumentMatchesMarkdownUrlSyntax() {
    // Arrange, Act and Assert
    assertFalse(StringExtensionsKt.lastArgumentMatchesMarkdownUrlSyntax("https://example.org/example"));
  }

  /**
   * Method under test: {@link StringExtensionsKt#lastArgumentMatchesUrl(String)}
   */
  @Test
  void testLastArgumentMatchesUrl() {
    // Arrange, Act and Assert
    assertTrue(StringExtensionsKt.lastArgumentMatchesUrl("https://example.org/example"));
    assertFalse(StringExtensionsKt.lastArgumentMatchesUrl("foo"));
    assertFalse(StringExtensionsKt.lastArgumentMatchesUrl("https://example.org/example<this>"));
    assertTrue(StringExtensionsKt.lastArgumentMatchesUrl(" https://example.org/example"));
  }
}

