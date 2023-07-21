package io.gitlab.arturbosch.detekt.generator.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ConfigurationDiffblueTest {
  /**
   * Method under test: {@link Configuration#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange
    BooleanDefault defaultValue = new BooleanDefault(true);

    // Act and Assert
    assertEquals("Name", (new Configuration("Name", "The characteristics of someone or something", defaultValue,
        new BooleanDefault(true), "Deprecated")).component1());
  }

  /**
   * Method under test: {@link Configuration#component2()}
   */
  @Test
  void testComponent2() {
    // Arrange
    BooleanDefault defaultValue = new BooleanDefault(true);

    // Act and Assert
    assertEquals("The characteristics of someone or something",
        (new Configuration("Name", "The characteristics of someone or something", defaultValue,
            new BooleanDefault(true), "Deprecated")).component2());
  }

  /**
   * Method under test: {@link Configuration#component3()}
   */
  @Test
  void testComponent3() {
    // Arrange
    BooleanDefault defaultValue = new BooleanDefault(true);

    // Act and Assert
    assertSame(defaultValue, (new Configuration("Name", "The characteristics of someone or something", defaultValue,
        new BooleanDefault(true), "Deprecated")).component3());
  }

  /**
   * Method under test: {@link Configuration#component4()}
   */
  @Test
  void testComponent4() {
    // Arrange
    BooleanDefault defaultValue = new BooleanDefault(true);
    BooleanDefault defaultAndroidValue = new BooleanDefault(true);

    // Act and Assert
    assertSame(defaultAndroidValue, (new Configuration("Name", "The characteristics of someone or something",
        defaultValue, defaultAndroidValue, "Deprecated")).component4());
  }

  /**
   * Method under test: {@link Configuration#component5()}
   */
  @Test
  void testComponent5() {
    // Arrange
    BooleanDefault defaultValue = new BooleanDefault(true);

    // Act and Assert
    assertEquals("Deprecated", (new Configuration("Name", "The characteristics of someone or something", defaultValue,
        new BooleanDefault(true), "Deprecated")).component5());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link Configuration#Configuration(String, String, DefaultValue, DefaultValue, String)}
  *   <li>{@link Configuration#toString()}
  *   <li>{@link Configuration#getDefaultAndroidValue()}
  *   <li>{@link Configuration#getDefaultValue()}
  *   <li>{@link Configuration#getDeprecated()}
  *   <li>{@link Configuration#getDescription()}
  *   <li>{@link Configuration#getName()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange
    BooleanDefault defaultValue = new BooleanDefault(true);
    BooleanDefault defaultAndroidValue = new BooleanDefault(true);

    // Act
    Configuration actualConfiguration = new Configuration("Name", "The characteristics of someone or something",
        defaultValue, defaultAndroidValue, "Deprecated");
    String actualToStringResult = actualConfiguration.toString();

    // Assert
    assertSame(defaultAndroidValue, actualConfiguration.getDefaultAndroidValue());
    assertSame(defaultValue, actualConfiguration.getDefaultValue());
    assertEquals("Deprecated", actualConfiguration.getDeprecated());
    assertEquals("The characteristics of someone or something", actualConfiguration.getDescription());
    assertEquals("Name", actualConfiguration.getName());
    assertEquals("Configuration(name=Name, description=The characteristics of someone or something, defaultValue"
        + "=BooleanDefault(defaultValue=true), defaultAndroidValue=BooleanDefault(defaultValue=true),"
        + " deprecated=Deprecated)", actualToStringResult);
  }

  /**
   * Method under test: {@link Configuration#Configuration(String, String, DefaultValue, DefaultValue, String)}
   */
  @Test
  void testConstructor2() {
    // Arrange
    BooleanDefault defaultValue = new BooleanDefault(true);
    BooleanDefault defaultAndroidValue = new BooleanDefault(true);

    // Act
    Configuration actualConfiguration = new Configuration("Name", "The characteristics of someone or something",
        defaultValue, defaultAndroidValue, "Deprecated");

    // Assert
    assertEquals("Name", actualConfiguration.component1());
    assertTrue(actualConfiguration.isDeprecated());
    assertEquals("The characteristics of someone or something", actualConfiguration.getDescription());
    assertSame(defaultValue, actualConfiguration.getDefaultValue());
    assertSame(defaultAndroidValue, actualConfiguration.getDefaultAndroidValue());
  }

  /**
   * Method under test: {@link Configuration#copy(String, String, DefaultValue, DefaultValue, String)}
   */
  @Test
  void testCopy() {
    // Arrange
    BooleanDefault defaultValue = new BooleanDefault(true);
    Configuration configuration = new Configuration("Name", "The characteristics of someone or something", defaultValue,
        new BooleanDefault(true), "Deprecated");
    BooleanDefault defaultValue2 = new BooleanDefault(true);
    BooleanDefault defaultAndroidValue = new BooleanDefault(true);

    // Act
    Configuration actualCopyResult = configuration.copy("Name", "The characteristics of someone or something",
        defaultValue2, defaultAndroidValue, "Deprecated");

    // Assert
    assertEquals("Name", actualCopyResult.component1());
    assertTrue(actualCopyResult.isDeprecated());
    assertEquals("The characteristics of someone or something", actualCopyResult.getDescription());
    assertSame(defaultValue2, actualCopyResult.getDefaultValue());
    assertSame(defaultAndroidValue, actualCopyResult.getDefaultAndroidValue());
  }

  /**
   * Method under test: {@link Configuration#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange
    BooleanDefault defaultValue = new BooleanDefault(true);

    // Act and Assert
    assertNotEquals(new Configuration("Name", "The characteristics of someone or something", defaultValue,
        new BooleanDefault(true), "Deprecated"), null);
  }

  /**
   * Method under test: {@link Configuration#equals(Object)}
   */
  @Test
  void testEquals2() {
    // Arrange
    BooleanDefault defaultValue = new BooleanDefault(true);

    // Act and Assert
    assertNotEquals(new Configuration("Name", "The characteristics of someone or something", defaultValue,
        new BooleanDefault(true), "Deprecated"), "Different type to Configuration");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link Configuration#equals(Object)}
   *   <li>{@link Configuration#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    BooleanDefault defaultValue = new BooleanDefault(true);
    Configuration configuration = new Configuration("Name", "The characteristics of someone or something", defaultValue,
        new BooleanDefault(true), "Deprecated");

    // Act and Assert
    assertEquals(configuration, configuration);
    int expectedHashCodeResult = configuration.hashCode();
    assertEquals(expectedHashCodeResult, configuration.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link Configuration#equals(Object)}
   *   <li>{@link Configuration#hashCode()}
   * </ul>
   */
  @Test
  void testEquals4() {
    // Arrange
    BooleanDefault defaultValue = new BooleanDefault(true);
    Configuration configuration = new Configuration("Name", "The characteristics of someone or something", defaultValue,
        new BooleanDefault(true), "Deprecated");
    BooleanDefault defaultValue2 = new BooleanDefault(true);
    Configuration configuration2 = new Configuration("Name", "The characteristics of someone or something",
        defaultValue2, new BooleanDefault(true), "Deprecated");

    // Act and Assert
    assertEquals(configuration, configuration2);
    int expectedHashCodeResult = configuration.hashCode();
    assertEquals(expectedHashCodeResult, configuration2.hashCode());
  }

  /**
   * Method under test: {@link Configuration#equals(Object)}
   */
  @Test
  void testEquals5() {
    // Arrange
    BooleanDefault defaultValue = new BooleanDefault(true);
    Configuration configuration = new Configuration("defaultValue", "The characteristics of someone or something",
        defaultValue, new BooleanDefault(true), "Deprecated");
    BooleanDefault defaultValue2 = new BooleanDefault(true);

    // Act and Assert
    assertNotEquals(configuration, new Configuration("Name", "The characteristics of someone or something",
        defaultValue2, new BooleanDefault(true), "Deprecated"));
  }

  /**
   * Method under test: {@link Configuration#equals(Object)}
   */
  @Test
  void testEquals6() {
    // Arrange
    BooleanDefault defaultValue = new BooleanDefault(true);
    Configuration configuration = new Configuration("Name", "Description", defaultValue, new BooleanDefault(true),
        "Deprecated");
    BooleanDefault defaultValue2 = new BooleanDefault(true);

    // Act and Assert
    assertNotEquals(configuration, new Configuration("Name", "The characteristics of someone or something",
        defaultValue2, new BooleanDefault(true), "Deprecated"));
  }

  /**
   * Method under test: {@link Configuration#equals(Object)}
   */
  @Test
  void testEquals7() {
    // Arrange
    BooleanDefault defaultValue = new BooleanDefault(false);
    Configuration configuration = new Configuration("Name", "The characteristics of someone or something", defaultValue,
        new BooleanDefault(true), "Deprecated");
    BooleanDefault defaultValue2 = new BooleanDefault(true);

    // Act and Assert
    assertNotEquals(configuration, new Configuration("Name", "The characteristics of someone or something",
        defaultValue2, new BooleanDefault(true), "Deprecated"));
  }

  /**
   * Method under test: {@link Configuration#equals(Object)}
   */
  @Test
  void testEquals8() {
    // Arrange
    BooleanDefault defaultValue = new BooleanDefault(true);
    Configuration configuration = new Configuration("Name", "The characteristics of someone or something", defaultValue,
        new BooleanDefault(false), "Deprecated");
    BooleanDefault defaultValue2 = new BooleanDefault(true);

    // Act and Assert
    assertNotEquals(configuration, new Configuration("Name", "The characteristics of someone or something",
        defaultValue2, new BooleanDefault(true), "Deprecated"));
  }

  /**
   * Method under test: {@link Configuration#equals(Object)}
   */
  @Test
  void testEquals9() {
    // Arrange
    BooleanDefault defaultValue = new BooleanDefault(true);
    Configuration configuration = new Configuration("Name", "The characteristics of someone or something", defaultValue,
        new BooleanDefault(true), "defaultValue");
    BooleanDefault defaultValue2 = new BooleanDefault(true);

    // Act and Assert
    assertNotEquals(configuration, new Configuration("Name", "The characteristics of someone or something",
        defaultValue2, new BooleanDefault(true), "Deprecated"));
  }

  /**
   * Method under test: {@link Configuration#isDeprecated()}
   */
  @Test
  void testIsDeprecated() {
    // Arrange
    BooleanDefault defaultValue = new BooleanDefault(true);

    // Act and Assert
    assertTrue((new Configuration("Name", "The characteristics of someone or something", defaultValue,
        new BooleanDefault(true), "Deprecated")).isDeprecated());
  }

  /**
   * Method under test: {@link Configuration#isDeprecated()}
   */
  @Test
  void testIsDeprecated2() {
    // Arrange
    BooleanDefault defaultValue = new BooleanDefault(true);

    // Act and Assert
    assertFalse((new Configuration("Name", "The characteristics of someone or something", defaultValue,
        new BooleanDefault(true), null)).isDeprecated());
  }
}

