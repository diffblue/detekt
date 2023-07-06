package io.github.detekt.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MarkdownDiffblueTest {
  /**
   * Method under test: {@link Markdown#append(String)}
   */
  @Test
  void testAppend() {
    // Arrange
    MarkdownContent markdownContent = new MarkdownContent();

    // Act
    markdownContent.append("42");

    // Assert
    assertEquals("42", markdownContent.component1());
  }

  /**
   * Method under test: {@link Markdown#append(String)}
   */
  @Test
  void testAppend2() {
    // Arrange
    MarkdownContent markdownContent = new MarkdownContent();
    markdownContent.setContent("foo");

    // Act
    markdownContent.append("foo");

    // Assert
    assertEquals("foo\nfoo", markdownContent.component1());
  }

  /**
   * Method under test: {@link Markdown#append(String)}
   */
  @Test
  void testAppend3() {
    // Arrange
    MarkdownContent markdownContent = new MarkdownContent();

    // Act
    markdownContent.append("");

    // Assert that nothing has changed
    assertEquals("", markdownContent.component1());
  }

  /**
  * Method under test: {@link Markdown#getContent()}
  */
  @Test
  void testGetContent() {
    // Arrange, Act and Assert
    assertEquals("", (new MarkdownContent()).getContent());
  }

  /**
   * Method under test: {@link Markdown#setContent(String)}
   */
  @Test
  void testSetContent() {
    // Arrange
    MarkdownContent markdownContent = new MarkdownContent();

    // Act
    markdownContent.setContent("Not all who wander are lost");

    // Assert
    assertEquals("Not all who wander are lost", markdownContent.component1());
  }
}

