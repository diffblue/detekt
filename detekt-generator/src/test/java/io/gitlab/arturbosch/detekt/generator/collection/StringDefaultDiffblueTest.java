package io.gitlab.arturbosch.detekt.generator.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import io.github.detekt.utils.YamlNode;
import org.junit.jupiter.api.Test;

class StringDefaultDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link StringDefault#StringDefault(String)}
  *   <li>{@link StringDefault#toString()}
  *   <li>{@link StringDefault#getPlainValue()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    StringDefault actualStringDefault = new StringDefault("42");
    String actualToStringResult = actualStringDefault.toString();

    // Assert
    assertEquals("42", actualStringDefault.getPlainValue());
    assertEquals("StringDefault(defaultValue=42)", actualToStringResult);
  }

  /**
   * Method under test: {@link StringDefault#StringDefault(String)}
   */
  @Test
  void testConstructor2() {
    // Arrange, Act and Assert
    assertEquals("42", (new StringDefault("42")).getPlainValue());
  }

  /**
   * Method under test: {@link StringDefault#copy(String)}
   */
  @Test
  void testCopy() {
    // Arrange, Act and Assert
    assertEquals("42", (new StringDefault("42")).copy("42").getPlainValue());
  }

  /**
   * Method under test: {@link StringDefault#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new StringDefault("42"), null);
    assertNotEquals(new StringDefault("42"), "Different type to StringDefault");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link StringDefault#equals(Object)}
   *   <li>{@link StringDefault#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    StringDefault stringDefault = new StringDefault("42");

    // Act and Assert
    assertEquals(stringDefault, stringDefault);
    int expectedHashCodeResult = stringDefault.hashCode();
    assertEquals(expectedHashCodeResult, stringDefault.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link StringDefault#equals(Object)}
   *   <li>{@link StringDefault#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    StringDefault stringDefault = new StringDefault("42");
    StringDefault stringDefault2 = new StringDefault("42");

    // Act and Assert
    assertEquals(stringDefault, stringDefault2);
    int expectedHashCodeResult = stringDefault.hashCode();
    assertEquals(expectedHashCodeResult, stringDefault2.hashCode());
  }

  /**
   * Method under test: {@link StringDefault#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    StringDefault stringDefault = new StringDefault("Default Value");

    // Act and Assert
    assertNotEquals(stringDefault, new StringDefault("42"));
  }

  /**
   * Method under test: {@link StringDefault#printAsMarkdownCode()}
   */
  @Test
  void testPrintAsMarkdownCode() {
    // Arrange, Act and Assert
    assertEquals("'42'", (new StringDefault("42")).printAsMarkdownCode());
  }

  /**
   * Method under test: {@link StringDefault#printAsYaml(String, YamlNode)}
   */
  @Test
  void testPrintAsYaml() {
    // Arrange
    StringDefault stringDefault = new StringDefault("42");
    YamlNode yaml = new YamlNode();

    // Act
    stringDefault.printAsYaml("Name", yaml);

    // Assert
    assertEquals("Name: '42'", yaml.getContent());
  }
}

