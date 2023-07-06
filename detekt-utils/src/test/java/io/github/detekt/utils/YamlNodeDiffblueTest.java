package io.github.detekt.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

class YamlNodeDiffblueTest {
  /**
   * Method under test: {@link YamlNode#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange, Act and Assert
    assertEquals(0, (new YamlNode()).component1());
  }

  /**
   * Method under test: {@link YamlNode#component2()}
   */
  @Test
  void testComponent2() {
    // Arrange, Act and Assert
    assertEquals("", (new YamlNode()).component2());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link YamlNode#YamlNode()}
  *   <li>{@link YamlNode#setContent(String)}
  *   <li>{@link YamlNode#toString()}
  *   <li>{@link YamlNode#getContent()}
  *   <li>{@link YamlNode#getIndent()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    YamlNode actualYamlNode = new YamlNode();
    actualYamlNode.setContent("Not all who wander are lost");
    String actualToStringResult = actualYamlNode.toString();

    // Assert
    assertEquals("Not all who wander are lost", actualYamlNode.getContent());
    assertEquals(0, actualYamlNode.getIndent());
    assertEquals("YamlNode(indent=0, content=Not all who wander are lost)", actualToStringResult);
  }

  /**
   * Method under test: {@link YamlNode#YamlNode()}
   */
  @Test
  void testConstructor2() {
    // Arrange and Act
    YamlNode actualYamlNode = new YamlNode();

    // Assert
    assertEquals(0, actualYamlNode.component1());
    assertEquals("", actualYamlNode.getContent());
  }

  /**
   * Method under test: {@link YamlNode#YamlNode(int, String)}
   */
  @Test
  void testConstructor3() {
    // Arrange and Act
    YamlNode actualYamlNode = new YamlNode(1, "Not all who wander are lost");

    // Assert
    assertEquals(1, actualYamlNode.component1());
    assertEquals("Not all who wander are lost", actualYamlNode.getContent());
  }

  /**
   * Method under test: {@link YamlNode#copy(int, String)}
   */
  @Test
  void testCopy() {
    // Arrange and Act
    YamlNode actualCopyResult = (new YamlNode()).copy(1, "Not all who wander are lost");

    // Assert
    assertEquals(1, actualCopyResult.component1());
    assertEquals("Not all who wander are lost", actualCopyResult.getContent());
  }

  /**
   * Method under test: {@link YamlNode#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new YamlNode(), null);
    assertNotEquals(new YamlNode(), "Different type to YamlNode");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link YamlNode#equals(Object)}
   *   <li>{@link YamlNode#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    YamlNode yamlNode = new YamlNode();

    // Act and Assert
    assertEquals(yamlNode, yamlNode);
    int expectedHashCodeResult = yamlNode.hashCode();
    assertEquals(expectedHashCodeResult, yamlNode.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link YamlNode#equals(Object)}
   *   <li>{@link YamlNode#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    YamlNode yamlNode = new YamlNode();
    YamlNode yamlNode2 = new YamlNode();

    // Act and Assert
    assertEquals(yamlNode, yamlNode2);
    int expectedHashCodeResult = yamlNode.hashCode();
    assertEquals(expectedHashCodeResult, yamlNode2.hashCode());
  }

  /**
   * Method under test: {@link YamlNode#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    YamlNode yamlNode = new YamlNode(1, "Not all who wander are lost");

    // Act and Assert
    assertNotEquals(yamlNode, new YamlNode());
  }

  /**
   * Method under test: {@link YamlNode#equals(Object)}
   */
  @Test
  void testEquals5() {
    // Arrange
    YamlNode yamlNode = new YamlNode();
    yamlNode.append("42");

    // Act and Assert
    assertNotEquals(yamlNode, new YamlNode());
  }
}

