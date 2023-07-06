package io.gitlab.arturbosch.detekt.generator.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.github.detekt.utils.YamlNode;
import io.gitlab.arturbosch.detekt.api.ValueWithReason;
import io.gitlab.arturbosch.detekt.api.ValuesWithReason;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class ValuesWithReasonDefaultDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link ValuesWithReasonDefault#ValuesWithReasonDefault(ValuesWithReason)}
  *   <li>{@link ValuesWithReasonDefault#toString()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("ValuesWithReasonDefault(defaultValue=ValuesWithReason(values=[]))",
        (new ValuesWithReasonDefault(new ValuesWithReason(new ArrayList<>()))).toString());
    assertEquals("[]", (new ValuesWithReasonDefault(new ValuesWithReason(new ArrayList<>()))).printAsMarkdownCode());
  }

  /**
   * Method under test: {@link ValuesWithReasonDefault#copy(ValuesWithReason)}
   */
  @Test
  void testCopy() {
    // Arrange
    ValuesWithReasonDefault valuesWithReasonDefault = new ValuesWithReasonDefault(
        new ValuesWithReason(new ArrayList<>()));

    // Act and Assert
    assertEquals("[]", valuesWithReasonDefault.copy(new ValuesWithReason(new ArrayList<>())).printAsMarkdownCode());
  }

  /**
   * Method under test: {@link ValuesWithReasonDefault#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new ValuesWithReasonDefault(new ValuesWithReason(new ArrayList<>())), null);
    assertNotEquals(new ValuesWithReasonDefault(new ValuesWithReason(new ArrayList<>())),
        "Different type to ValuesWithReasonDefault");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link ValuesWithReasonDefault#equals(Object)}
   *   <li>{@link ValuesWithReasonDefault#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    ValuesWithReasonDefault valuesWithReasonDefault = new ValuesWithReasonDefault(
        new ValuesWithReason(new ArrayList<>()));

    // Act and Assert
    assertEquals(valuesWithReasonDefault, valuesWithReasonDefault);
    int expectedHashCodeResult = valuesWithReasonDefault.hashCode();
    assertEquals(expectedHashCodeResult, valuesWithReasonDefault.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link ValuesWithReasonDefault#equals(Object)}
   *   <li>{@link ValuesWithReasonDefault#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    ValuesWithReasonDefault valuesWithReasonDefault = new ValuesWithReasonDefault(
        new ValuesWithReason(new ArrayList<>()));
    ValuesWithReasonDefault valuesWithReasonDefault2 = new ValuesWithReasonDefault(
        new ValuesWithReason(new ArrayList<>()));

    // Act and Assert
    assertEquals(valuesWithReasonDefault, valuesWithReasonDefault2);
    int expectedHashCodeResult = valuesWithReasonDefault.hashCode();
    assertEquals(expectedHashCodeResult, valuesWithReasonDefault2.hashCode());
  }

  /**
   * Method under test: {@link ValuesWithReasonDefault#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    ArrayList<ValueWithReason> values = new ArrayList<>();
    values.add(new ValueWithReason("42", "Just cause"));
    ValuesWithReasonDefault valuesWithReasonDefault = new ValuesWithReasonDefault(new ValuesWithReason(values));

    // Act and Assert
    assertNotEquals(valuesWithReasonDefault, new ValuesWithReasonDefault(new ValuesWithReason(new ArrayList<>())));
  }

  /**
   * Method under test: {@link ValuesWithReasonDefault#getPlainValue()}
   */
  @Test
  void testGetPlainValue() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class,
        () -> (new ValuesWithReasonDefault(new ValuesWithReason(new ArrayList<>()))).getPlainValue());
  }

  /**
   * Method under test: {@link ValuesWithReasonDefault#printAsMarkdownCode()}
   */
  @Test
  void testPrintAsMarkdownCode() {
    // Arrange, Act and Assert
    assertEquals("[]", (new ValuesWithReasonDefault(new ValuesWithReason(new ArrayList<>()))).printAsMarkdownCode());
  }

  /**
   * Method under test: {@link ValuesWithReasonDefault#printAsMarkdownCode()}
   */
  @Test
  void testPrintAsMarkdownCode2() {
    // Arrange
    ArrayList<ValueWithReason> values = new ArrayList<>();
    values.add(new ValueWithReason("42", "Just cause"));

    // Act and Assert
    assertEquals("['42']", (new ValuesWithReasonDefault(new ValuesWithReason(values))).printAsMarkdownCode());
  }

  /**
   * Method under test: {@link ValuesWithReasonDefault#printAsYaml(String, YamlNode)}
   */
  @Test
  void testPrintAsYaml() {
    // Arrange
    ValuesWithReasonDefault valuesWithReasonDefault = new ValuesWithReasonDefault(
        new ValuesWithReason(new ArrayList<>()));
    YamlNode yaml = new YamlNode();

    // Act
    valuesWithReasonDefault.printAsYaml("Name", yaml);

    // Assert
    assertEquals("Name: []", yaml.getContent());
  }

  /**
   * Method under test: {@link ValuesWithReasonDefault#printAsYaml(String, YamlNode)}
   */
  @Test
  void testPrintAsYaml2() {
    // Arrange
    ArrayList<ValueWithReason> values = new ArrayList<>();
    values.add(new ValueWithReason("42", "Just cause"));
    ValuesWithReasonDefault valuesWithReasonDefault = new ValuesWithReasonDefault(new ValuesWithReason(values));
    YamlNode yaml = new YamlNode();

    // Act
    valuesWithReasonDefault.printAsYaml("Name", yaml);

    // Assert
    assertEquals("Name:\n  - reason: 'Just cause'\n    value: '42'", yaml.getContent());
  }

  /**
   * Method under test: {@link ValuesWithReasonDefault#printAsYaml(String, YamlNode)}
   */
  @Test
  void testPrintAsYaml3() {
    // Arrange
    ArrayList<ValueWithReason> values = new ArrayList<>();
    values.add(new ValueWithReason("", "Just cause"));
    ValuesWithReasonDefault valuesWithReasonDefault = new ValuesWithReasonDefault(new ValuesWithReason(values));
    YamlNode yaml = new YamlNode();

    // Act
    valuesWithReasonDefault.printAsYaml("Name", yaml);

    // Assert
    assertEquals("Name:\n  - reason: 'Just cause'\n    value: ''", yaml.getContent());
  }
}

