package io.gitlab.arturbosch.detekt.generator.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import io.github.detekt.utils.YamlNode;
import org.junit.jupiter.api.Test;

class BooleanDefaultDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link BooleanDefault#BooleanDefault(boolean)}
  *   <li>{@link BooleanDefault#toString()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("BooleanDefault(defaultValue=true)", (new BooleanDefault(true)).toString());
  }

  /**
   * Method under test: {@link BooleanDefault#copy(boolean)}
   */
  @Test
  void testCopy() {
    // Arrange and Act
    BooleanDefault actualCopyResult = (new BooleanDefault(true)).copy(true);

    // Assert
    String expectedPlainValue = Boolean.TRUE.toString();
    assertEquals(expectedPlainValue, actualCopyResult.getPlainValue());
  }

  /**
   * Method under test: {@link BooleanDefault#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new BooleanDefault(true), null);
    assertNotEquals(new BooleanDefault(true), "Different type to BooleanDefault");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link BooleanDefault#equals(Object)}
   *   <li>{@link BooleanDefault#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    BooleanDefault booleanDefault = new BooleanDefault(true);

    // Act and Assert
    assertEquals(booleanDefault, booleanDefault);
    int expectedHashCodeResult = booleanDefault.hashCode();
    assertEquals(expectedHashCodeResult, booleanDefault.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link BooleanDefault#equals(Object)}
   *   <li>{@link BooleanDefault#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    BooleanDefault booleanDefault = new BooleanDefault(true);
    BooleanDefault booleanDefault2 = new BooleanDefault(true);

    // Act and Assert
    assertEquals(booleanDefault, booleanDefault2);
    int expectedHashCodeResult = booleanDefault.hashCode();
    assertEquals(expectedHashCodeResult, booleanDefault2.hashCode());
  }

  /**
   * Method under test: {@link BooleanDefault#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    BooleanDefault booleanDefault = new BooleanDefault(false);

    // Act and Assert
    assertNotEquals(booleanDefault, new BooleanDefault(true));
  }

  /**
   * Method under test: {@link BooleanDefault#getPlainValue()}
   */
  @Test
  void testGetPlainValue() {
    // Arrange and Act
    String actualPlainValue = (new BooleanDefault(true)).getPlainValue();

    // Assert
    assertEquals(Boolean.TRUE.toString(), actualPlainValue);
  }

  /**
   * Method under test: {@link BooleanDefault#printAsMarkdownCode()}
   */
  @Test
  void testPrintAsMarkdownCode() {
    // Arrange and Act
    String actualPrintAsMarkdownCodeResult = (new BooleanDefault(true)).printAsMarkdownCode();

    // Assert
    assertEquals(Boolean.TRUE.toString(), actualPrintAsMarkdownCodeResult);
  }

  /**
   * Method under test: {@link BooleanDefault#printAsYaml(String, YamlNode)}
   */
  @Test
  void testPrintAsYaml() {
    // Arrange
    BooleanDefault booleanDefault = new BooleanDefault(true);
    YamlNode yaml = new YamlNode();

    // Act
    booleanDefault.printAsYaml("Name", yaml);

    // Assert
    assertEquals("Name: true", yaml.getContent());
  }
}

