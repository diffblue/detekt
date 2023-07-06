package io.gitlab.arturbosch.detekt.core.config.validation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ValidationSettingsDiffblueTest {
  /**
   * Method under test: {@link ValidationSettings#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange, Act and Assert
    assertFalse((new ValidationSettings()).component1());
    assertTrue((new ValidationSettings(true)).component1());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link ValidationSettings#ValidationSettings(boolean)}
  *   <li>{@link ValidationSettings#toString()}
  *   <li>{@link ValidationSettings#getCheckExhaustiveness()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    ValidationSettings actualValidationSettings = new ValidationSettings(true);
    String actualToStringResult = actualValidationSettings.toString();

    // Assert
    assertTrue(actualValidationSettings.getCheckExhaustiveness());
    assertEquals("ValidationSettings(checkExhaustiveness=true)", actualToStringResult);
  }

  /**
   * Method under test: {@link ValidationSettings#ValidationSettings()}
   */
  @Test
  void testConstructor2() {
    // Arrange, Act and Assert
    assertFalse((new ValidationSettings()).component1());
  }

  /**
   * Method under test: {@link ValidationSettings#copy(boolean)}
   */
  @Test
  void testCopy() {
    // Arrange, Act and Assert
    assertTrue((new ValidationSettings()).copy(true).component1());
  }

  /**
   * Method under test: {@link ValidationSettings#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new ValidationSettings(), null);
    assertNotEquals(new ValidationSettings(), "Different type to ValidationSettings");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link ValidationSettings#equals(Object)}
   *   <li>{@link ValidationSettings#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    ValidationSettings validationSettings = new ValidationSettings();

    // Act and Assert
    assertEquals(validationSettings, validationSettings);
    int expectedHashCodeResult = validationSettings.hashCode();
    assertEquals(expectedHashCodeResult, validationSettings.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link ValidationSettings#equals(Object)}
   *   <li>{@link ValidationSettings#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    ValidationSettings validationSettings = new ValidationSettings();
    ValidationSettings validationSettings2 = new ValidationSettings();

    // Act and Assert
    assertEquals(validationSettings, validationSettings2);
    int expectedHashCodeResult = validationSettings.hashCode();
    assertEquals(expectedHashCodeResult, validationSettings2.hashCode());
  }

  /**
   * Method under test: {@link ValidationSettings#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    ValidationSettings validationSettings = new ValidationSettings(true);

    // Act and Assert
    assertNotEquals(validationSettings, new ValidationSettings());
  }
}

