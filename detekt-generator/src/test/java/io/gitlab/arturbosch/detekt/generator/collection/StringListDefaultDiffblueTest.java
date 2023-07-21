package io.gitlab.arturbosch.detekt.generator.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.github.detekt.utils.YamlNode;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class StringListDefaultDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link StringListDefault#StringListDefault(List)}
  *   <li>{@link StringListDefault#toString()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("StringListDefault(defaultValue=[])", (new StringListDefault(new ArrayList<>())).toString());
    assertEquals("[]", (new StringListDefault(new ArrayList<>())).printAsMarkdownCode());
  }

  /**
   * Method under test: {@link StringListDefault#StringListDefault(List)}
   */
  @Test
  void testConstructor2() {
    // Arrange
    ArrayList<String> defaultValue = new ArrayList<>();
    defaultValue.add("defaultValue");

    // Act and Assert
    assertEquals("['defaultValue']", (new StringListDefault(defaultValue)).printAsMarkdownCode());
  }

  /**
   * Method under test: {@link StringListDefault#copy(List)}
   */
  @Test
  void testCopy() {
    // Arrange
    StringListDefault stringListDefault = new StringListDefault(new ArrayList<>());

    // Act and Assert
    assertEquals("[]", stringListDefault.copy(new ArrayList<>()).printAsMarkdownCode());
  }

  /**
   * Method under test: {@link StringListDefault#copy(List)}
   */
  @Test
  void testCopy2() {
    // Arrange
    StringListDefault stringListDefault = new StringListDefault(new ArrayList<>());

    ArrayList<String> defaultValue = new ArrayList<>();
    defaultValue.add("defaultValue");

    // Act and Assert
    assertEquals("['defaultValue']", stringListDefault.copy(defaultValue).printAsMarkdownCode());
  }

  /**
   * Method under test: {@link StringListDefault#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new StringListDefault(new ArrayList<>()), null);
    assertNotEquals(new StringListDefault(new ArrayList<>()), "Different type to StringListDefault");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link StringListDefault#equals(Object)}
   *   <li>{@link StringListDefault#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    StringListDefault stringListDefault = new StringListDefault(new ArrayList<>());

    // Act and Assert
    assertEquals(stringListDefault, stringListDefault);
    int expectedHashCodeResult = stringListDefault.hashCode();
    assertEquals(expectedHashCodeResult, stringListDefault.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link StringListDefault#equals(Object)}
   *   <li>{@link StringListDefault#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    StringListDefault stringListDefault = new StringListDefault(new ArrayList<>());
    StringListDefault stringListDefault2 = new StringListDefault(new ArrayList<>());

    // Act and Assert
    assertEquals(stringListDefault, stringListDefault2);
    int expectedHashCodeResult = stringListDefault.hashCode();
    assertEquals(expectedHashCodeResult, stringListDefault2.hashCode());
  }

  /**
   * Method under test: {@link StringListDefault#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    ArrayList<String> defaultValue = new ArrayList<>();
    defaultValue.add("foo");
    StringListDefault stringListDefault = new StringListDefault(defaultValue);

    // Act and Assert
    assertNotEquals(stringListDefault, new StringListDefault(new ArrayList<>()));
  }

  /**
   * Method under test: {@link StringListDefault#getPlainValue()}
   */
  @Test
  void testGetPlainValue() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class, () -> (new StringListDefault(new ArrayList<>())).getPlainValue());
  }

  /**
   * Method under test: {@link StringListDefault#printAsMarkdownCode()}
   */
  @Test
  void testPrintAsMarkdownCode() {
    // Arrange, Act and Assert
    assertEquals("[]", (new StringListDefault(new ArrayList<>())).printAsMarkdownCode());
  }

  /**
   * Method under test: {@link StringListDefault#printAsYaml(String, YamlNode)}
   */
  @Test
  void testPrintAsYaml() {
    // Arrange
    StringListDefault stringListDefault = new StringListDefault(new ArrayList<>());
    YamlNode yaml = new YamlNode();

    // Act
    stringListDefault.printAsYaml("Name", yaml);

    // Assert
    assertEquals("Name: []", yaml.getContent());
  }

  /**
   * Method under test: {@link StringListDefault#printAsYaml(String, YamlNode)}
   */
  @Test
  void testPrintAsYaml2() {
    // Arrange
    ArrayList<String> defaultValue = new ArrayList<>();
    defaultValue.add("name");
    StringListDefault stringListDefault = new StringListDefault(defaultValue);
    YamlNode yaml = new YamlNode();

    // Act
    stringListDefault.printAsYaml("Name", yaml);

    // Assert
    assertEquals("Name:\n  - 'name'", yaml.getContent());
  }

  /**
   * Method under test: {@link StringListDefault#printAsYaml(String, YamlNode)}
   */
  @Test
  void testPrintAsYaml3() {
    // Arrange
    ArrayList<String> defaultValue = new ArrayList<>();
    defaultValue.add("");
    StringListDefault stringListDefault = new StringListDefault(defaultValue);
    YamlNode yaml = new YamlNode();

    // Act
    stringListDefault.printAsYaml("Name", yaml);

    // Assert
    assertEquals("Name:\n  - ''", yaml.getContent());
  }
}

