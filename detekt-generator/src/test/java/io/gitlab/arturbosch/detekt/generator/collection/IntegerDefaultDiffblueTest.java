package io.gitlab.arturbosch.detekt.generator.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import io.github.detekt.utils.YamlNode;
import org.junit.jupiter.api.Test;

class IntegerDefaultDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link IntegerDefault#IntegerDefault(int)}
  *   <li>{@link IntegerDefault#toString()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("IntegerDefault(defaultValue=42)", (new IntegerDefault(42)).toString());
  }

  /**
   * Method under test: {@link IntegerDefault#copy(int)}
   */
  @Test
  void testCopy() {
    // Arrange, Act and Assert
    assertEquals("42", (new IntegerDefault(42)).copy(42).getPlainValue());
  }

  /**
   * Method under test: {@link IntegerDefault#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new IntegerDefault(42), null);
    assertNotEquals(new IntegerDefault(42), "Different type to IntegerDefault");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link IntegerDefault#equals(Object)}
   *   <li>{@link IntegerDefault#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    IntegerDefault integerDefault = new IntegerDefault(42);

    // Act and Assert
    assertEquals(integerDefault, integerDefault);
    int expectedHashCodeResult = integerDefault.hashCode();
    assertEquals(expectedHashCodeResult, integerDefault.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link IntegerDefault#equals(Object)}
   *   <li>{@link IntegerDefault#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    IntegerDefault integerDefault = new IntegerDefault(42);
    IntegerDefault integerDefault2 = new IntegerDefault(42);

    // Act and Assert
    assertEquals(integerDefault, integerDefault2);
    int expectedHashCodeResult = integerDefault.hashCode();
    assertEquals(expectedHashCodeResult, integerDefault2.hashCode());
  }

  /**
   * Method under test: {@link IntegerDefault#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    IntegerDefault integerDefault = new IntegerDefault(1);

    // Act and Assert
    assertNotEquals(integerDefault, new IntegerDefault(42));
  }

  /**
   * Method under test: {@link IntegerDefault#getPlainValue()}
   */
  @Test
  void testGetPlainValue() {
    // Arrange, Act and Assert
    assertEquals("42", (new IntegerDefault(42)).getPlainValue());
  }

  /**
   * Method under test: {@link IntegerDefault#printAsMarkdownCode()}
   */
  @Test
  void testPrintAsMarkdownCode() {
    // Arrange, Act and Assert
    assertEquals("42", (new IntegerDefault(42)).printAsMarkdownCode());
  }

  /**
   * Method under test: {@link IntegerDefault#printAsYaml(String, YamlNode)}
   */
  @Test
  void testPrintAsYaml() {
    // Arrange
    IntegerDefault integerDefault = new IntegerDefault(42);
    YamlNode yaml = new YamlNode();

    // Act
    integerDefault.printAsYaml("Name", yaml);

    // Assert
    assertEquals("Name: 42", yaml.getContent());
  }
}

