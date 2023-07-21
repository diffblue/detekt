package io.gitlab.arturbosch.detekt.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.Test;

class SplitPatternDiffblueTest {
  /**
   * Method under test: {@link SplitPattern#any(String)}
   */
  @Test
  void testAny() {
    // Arrange, Act and Assert
    assertFalse((new SplitPattern("Text", "Delimiters", true)).any("42"));
    assertTrue((new SplitPattern("42", "Delimiters", true)).any("42"));
    assertFalse((new SplitPattern("", "Delimiters", true)).any("42"));
    assertFalse((new SplitPattern("Text", "Delimiters", true)).any(null));
  }

  /**
  * Method under test: {@link SplitPattern#SplitPattern(String, String, boolean)}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertFalse((new SplitPattern("Text", "Delimiters", true)).any("42"));
    assertFalse((new SplitPattern("foo", "foo", false)).any("42"));
  }

  /**
   * Method under test: {@link SplitPattern#contains(String)}
   */
  @Test
  void testContains() {
    // Arrange, Act and Assert
    assertFalse((new SplitPattern("Text", "Delimiters", true)).contains("42"));
    assertTrue((new SplitPattern("42", "Delimiters", true)).contains("42"));
    assertFalse((new SplitPattern("", "Delimiters", true)).contains("42"));
    assertFalse((new SplitPattern("Text", "Delimiters", true)).contains(null));
  }

  /**
   * Method under test: {@link SplitPattern#matches(String)}
   */
  @Test
  void testMatches() {
    // Arrange, Act and Assert
    assertTrue((new SplitPattern("Text", "Delimiters", true)).matches("42").isEmpty());
  }

  /**
   * Method under test: {@link SplitPattern#matches(String)}
   */
  @Test
  void testMatches2() {
    // Arrange and Act
    List<String> actualMatchesResult = (new SplitPattern("42", "Delimiters", true)).matches("42");

    // Assert
    assertEquals(1, actualMatchesResult.size());
    assertEquals("42", actualMatchesResult.get(0));
  }

  /**
   * Method under test: {@link SplitPattern#none(String)}
   */
  @Test
  void testNone() {
    // Arrange, Act and Assert
    assertTrue((new SplitPattern("Text", "Delimiters", true)).none("42"));
    assertFalse((new SplitPattern("42", "Delimiters", true)).none("42"));
    assertTrue((new SplitPattern("", "Delimiters", true)).none("42"));
  }

  /**
   * Method under test: {@link SplitPattern#startWith(String)}
   */
  @Test
  void testStartWith() {
    // Arrange, Act and Assert
    assertFalse((new SplitPattern("Text", "Delimiters", true)).startWith("42"));
    assertTrue((new SplitPattern("42", "Delimiters", true)).startWith("42"));
    assertFalse((new SplitPattern("", "Delimiters", true)).startWith("42"));
    assertFalse((new SplitPattern("Text", "Delimiters", true)).startWith(null));
  }
}

