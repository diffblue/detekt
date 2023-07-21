package io.gitlab.arturbosch.detekt.rules.style;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import kotlin.text.Regex;
import org.junit.jupiter.api.Test;

class ForbiddenDiffblueTest {
  /**
   * Method under test: {@link Forbidden#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange
    Regex resultImport = new Regex("Pattern");

    // Act and Assert
    assertSame(resultImport, (new Forbidden(resultImport, "Just cause")).component1());
  }

  /**
   * Method under test: {@link Forbidden#component2()}
   */
  @Test
  void testComponent2() {
    // Arrange, Act and Assert
    assertEquals("Just cause", (new Forbidden(new Regex("Pattern"), "Just cause")).component2());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link Forbidden#Forbidden(Regex, String)}
  *   <li>{@link Forbidden#toString()}
  *   <li>{@link Forbidden#getImport()}
  *   <li>{@link Forbidden#getReason()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    Forbidden actualForbidden = new Forbidden(new Regex("Pattern"), "Just cause");
    String actualToStringResult = actualForbidden.toString();

    // Assert
    Regex expectedImport = actualForbidden.component1();
    assertSame(expectedImport, actualForbidden.getImport());
    assertEquals("Just cause", actualForbidden.getReason());
    assertEquals("Forbidden(import=Pattern, reason=Just cause)", actualToStringResult);
  }

  /**
   * Method under test: {@link Forbidden#Forbidden(Regex, String)}
   */
  @Test
  void testConstructor2() {
    // Arrange
    Regex resultImport = new Regex("Pattern");

    // Act
    Forbidden actualForbidden = new Forbidden(resultImport, "Just cause");

    // Assert
    assertSame(resultImport, actualForbidden.component1());
    assertEquals("Just cause", actualForbidden.getReason());
  }

  /**
   * Method under test: {@link Forbidden#copy(Regex, String)}
   */
  @Test
  void testCopy() {
    // Arrange
    Forbidden forbidden = new Forbidden(new Regex("Pattern"), "Just cause");
    Regex resultImport = new Regex("Pattern");

    // Act
    Forbidden actualCopyResult = forbidden.copy(resultImport, "Just cause");

    // Assert
    assertSame(resultImport, actualCopyResult.component1());
    assertEquals("Just cause", actualCopyResult.getReason());
  }

  /**
   * Method under test: {@link Forbidden#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new Forbidden(new Regex("Pattern"), "Just cause"), null);
    assertNotEquals(new Forbidden(new Regex("Pattern"), "Just cause"), "Different type to Forbidden");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link Forbidden#equals(Object)}
   *   <li>{@link Forbidden#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    Forbidden forbidden = new Forbidden(new Regex("Pattern"), "Just cause");

    // Act and Assert
    assertEquals(forbidden, forbidden);
    int expectedHashCodeResult = forbidden.hashCode();
    assertEquals(expectedHashCodeResult, forbidden.hashCode());
  }

  /**
   * Method under test: {@link Forbidden#equals(Object)}
   */
  @Test
  void testEquals3() {
    // Arrange
    Forbidden forbidden = new Forbidden(new Regex("Pattern"), "Just cause");

    // Act and Assert
    assertNotEquals(forbidden, new Forbidden(new Regex("Pattern"), "Just cause"));
  }
}

