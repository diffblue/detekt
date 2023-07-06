package io.github.detekt.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

class MarkdownListDiffblueTest {
  /**
   * Method under test: {@link MarkdownList#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange, Act and Assert
    assertEquals("", (new MarkdownList()).component1());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link MarkdownList#MarkdownList()}
  *   <li>{@link MarkdownList#setContent(String)}
  *   <li>{@link MarkdownList#toString()}
  *   <li>{@link MarkdownList#getContent()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    MarkdownList actualMarkdownList = new MarkdownList();
    actualMarkdownList.setContent("Not all who wander are lost");
    String actualToStringResult = actualMarkdownList.toString();

    // Assert
    assertEquals("Not all who wander are lost", actualMarkdownList.getContent());
    assertEquals("MarkdownList(content=Not all who wander are lost)", actualToStringResult);
  }

  /**
   * Method under test: {@link MarkdownList#MarkdownList()}
   */
  @Test
  void testConstructor2() {
    // Arrange, Act and Assert
    assertEquals("", (new MarkdownList()).component1());
  }

  /**
   * Method under test: {@link MarkdownList#MarkdownList(String)}
   */
  @Test
  void testConstructor3() {
    // Arrange, Act and Assert
    assertEquals("Not all who wander are lost", (new MarkdownList("Not all who wander are lost")).component1());
  }

  /**
   * Method under test: {@link MarkdownList#copy(String)}
   */
  @Test
  void testCopy() {
    // Arrange, Act and Assert
    assertEquals("Not all who wander are lost", (new MarkdownList()).copy("Not all who wander are lost").component1());
  }

  /**
   * Method under test: {@link MarkdownList#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new MarkdownList(), null);
    assertNotEquals(new MarkdownList(), "Different type to MarkdownList");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link MarkdownList#equals(Object)}
   *   <li>{@link MarkdownList#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    MarkdownList markdownList = new MarkdownList();

    // Act and Assert
    assertEquals(markdownList, markdownList);
    int expectedHashCodeResult = markdownList.hashCode();
    assertEquals(expectedHashCodeResult, markdownList.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link MarkdownList#equals(Object)}
   *   <li>{@link MarkdownList#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    MarkdownList markdownList = new MarkdownList();
    MarkdownList markdownList2 = new MarkdownList();

    // Act and Assert
    assertEquals(markdownList, markdownList2);
    int expectedHashCodeResult = markdownList.hashCode();
    assertEquals(expectedHashCodeResult, markdownList2.hashCode());
  }

  /**
   * Method under test: {@link MarkdownList#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    MarkdownList markdownList = new MarkdownList("Not all who wander are lost");

    // Act and Assert
    assertNotEquals(markdownList, new MarkdownList());
  }
}

