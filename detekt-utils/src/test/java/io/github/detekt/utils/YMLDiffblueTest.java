package io.github.detekt.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class YMLDiffblueTest {
  /**
   * Method under test: {@link YML#append(String)}
   */
  @Test
  void testAppend() {
    // Arrange
    YamlNode yamlNode = new YamlNode();

    // Act
    yamlNode.append("42");

    // Assert
    assertEquals("42", yamlNode.getContent());
  }

  /**
   * Method under test: {@link YML#append(String)}
   */
  @Test
  void testAppend2() {
    // Arrange
    YamlNode yamlNode = new YamlNode();
    yamlNode.setContent("foo");

    // Act
    yamlNode.append("foo");

    // Assert
    assertEquals("foo\nfoo", yamlNode.getContent());
  }

  /**
   * Method under test: {@link YML#append(String)}
   */
  @Test
  void testAppend3() {
    // Arrange
    YamlNode yamlNode = new YamlNode(3, "Not all who wander are lost");
    yamlNode.setContent("foo");

    // Act
    yamlNode.append("foo");

    // Assert
    assertEquals("foo\n      foo", yamlNode.getContent());
  }

  /**
   * Method under test: {@link YML#emptyLine()}
   */
  @Test
  void testEmptyLine() {
    // Arrange
    YamlNode yamlNode = new YamlNode();

    // Act
    yamlNode.emptyLine();

    // Assert
    assertEquals("\n", yamlNode.getContent());
  }

  /**
  * Method under test: {@link YML#getContent()}
  */
  @Test
  void testGetContent() {
    // Arrange, Act and Assert
    assertEquals("", (new YamlNode()).getContent());
  }

  /**
   * Method under test: {@link YML#setContent(String)}
   */
  @Test
  void testSetContent() {
    // Arrange
    YamlNode yamlNode = new YamlNode();

    // Act
    yamlNode.setContent("Not all who wander are lost");

    // Assert
    assertEquals("Not all who wander are lost", yamlNode.getContent());
  }
}

