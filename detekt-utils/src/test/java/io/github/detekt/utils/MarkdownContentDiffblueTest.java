package io.github.detekt.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

class MarkdownContentDiffblueTest {
  /**
   * Method under test: {@link MarkdownContent#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange, Act and Assert
    assertEquals("", (new MarkdownContent()).component1());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link MarkdownContent#MarkdownContent()}
  *   <li>{@link MarkdownContent#setContent(String)}
  *   <li>{@link MarkdownContent#toString()}
  *   <li>{@link MarkdownContent#getContent()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    MarkdownContent actualMarkdownContent = new MarkdownContent();
    actualMarkdownContent.setContent("Not all who wander are lost");
    String actualToStringResult = actualMarkdownContent.toString();

    // Assert
    assertEquals("Not all who wander are lost", actualMarkdownContent.getContent());
    assertEquals("MarkdownContent(content=Not all who wander are lost)", actualToStringResult);
  }

  /**
   * Method under test: {@link MarkdownContent#MarkdownContent()}
   */
  @Test
  void testConstructor2() {
    // Arrange, Act and Assert
    assertEquals("", (new MarkdownContent()).component1());
  }

  /**
   * Method under test: {@link MarkdownContent#MarkdownContent(String)}
   */
  @Test
  void testConstructor3() {
    // Arrange, Act and Assert
    assertEquals("Not all who wander are lost", (new MarkdownContent("Not all who wander are lost")).component1());
  }

  /**
   * Method under test: {@link MarkdownContent#copy(String)}
   */
  @Test
  void testCopy() {
    // Arrange, Act and Assert
    assertEquals("Not all who wander are lost",
        (new MarkdownContent()).copy("Not all who wander are lost").component1());
  }

  /**
   * Method under test: {@link MarkdownContent#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new MarkdownContent(), null);
    assertNotEquals(new MarkdownContent(), "Different type to MarkdownContent");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link MarkdownContent#equals(Object)}
   *   <li>{@link MarkdownContent#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    MarkdownContent markdownContent = new MarkdownContent();

    // Act and Assert
    assertEquals(markdownContent, markdownContent);
    int expectedHashCodeResult = markdownContent.hashCode();
    assertEquals(expectedHashCodeResult, markdownContent.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link MarkdownContent#equals(Object)}
   *   <li>{@link MarkdownContent#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    MarkdownContent markdownContent = new MarkdownContent();
    MarkdownContent markdownContent2 = new MarkdownContent();

    // Act and Assert
    assertEquals(markdownContent, markdownContent2);
    int expectedHashCodeResult = markdownContent.hashCode();
    assertEquals(expectedHashCodeResult, markdownContent2.hashCode());
  }

  /**
   * Method under test: {@link MarkdownContent#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    MarkdownContent markdownContent = new MarkdownContent("Not all who wander are lost");

    // Act and Assert
    assertNotEquals(markdownContent, new MarkdownContent());
  }
}

